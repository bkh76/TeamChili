package compiler;

import ast.*;
import util.Pair;

import java.util.*;

public class TypeChecker extends ErrorList implements Visitor<Optional<type.Type>>
{
    SymbolTable symbolTable;
    
    public TypeChecker(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    
    // ===========================================
    // Types
    // ===========================================
    @Override
    public Optional<type.Type> visit(Type astType) {
        return Optional.of(astType.type); 
    }

    // ===========================================
    // Expressions: Literals
    // ===========================================
    @Override
    public Optional<type.Type> visit(ExpBool exp) {
        return Optional.of(type.Basic.BOOL);
    }
    
    @Override
    public Optional<type.Type> visit(ExpChar exp) {
        return Optional.of(type.Basic.CHAR);
    }
    
    @Override
    public Optional<type.Type> visit(ExpInt exp) {
        return Optional.of(type.Basic.INT);
    }
    
    @Override
    public Optional<type.Type> visit(ExpString exp) {
        type.Type array = new type.Array(type.Basic.CHAR);
        return Optional.of(array);
    }

    // ===========================================
    // Other Expressions
    // ===========================================
    @Override
    public Optional<type.Type> visit(ExpVar exp) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpBinop exp) {
        type.Type left = exp.left.accept(this).get();
        type.Type right = exp.right.accept(this).get();

        Signature signature = Signatures.binary.get(exp.op);
        
        return signature.returnType;
    }

    private boolean isArray(type.Type expType) {
        type.Array array = new type.Array(type.Basic.INT);
        if (expType.equals(array))
            return true;
        array.type = type.Basic.CHAR;
        if (expType.equals(array))
            return true;
        array.type = type.Basic.BOOL;
        if (expType.equals(array))
            return true;
        array.type = type.Basic.FLOAT;
        if (expType.equals(array))
            return true;
        array.type = type.Basic.BYTE;
        if (expType.equals(array))
            return true;
        return false;
    }
    
    @Override
    public Optional<type.Type> visit(ExpArrAccess exp) {
        if (isArray(exp.array.accept(this).get()))
            errors.add("At " + exp.array.pos +
                       "an array access on a non-array was attempted.");
        if (exp.index.accept(this).get() != type.Basic.INT)
            errors.add("At " + exp.index.pos +
                       "array index must be an integer.");
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpNew exp) {
        // The type doesn't matter but the expression is
        // the size which should be an int
        if (exp.exp.accept(this).get() != type.Basic.INT) {
            errors.add("At " + exp.exp.pos +
                       "the expression should be a size of type int");
        }
        
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpUnop exp) {
        type.Type expType = exp.exp.accept(this).get();

        Signature signature = Signatures.unary.get(exp.op);
               
        return signature.returnType;
    }

    @Override
    
    public Optional<type.Type> visit(ExpAssignop exp) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpFuncCall exp) {
        Signature signature = symbolTable.funcLookup(exp.funcName).get();
        List<type.Type> paramList = new ArrayList<>();

        for (Expression e : exp.arguments)
            paramList.add(e.accept(this).get());
        
        if (!signature.check(paramList))
            errors.add("At " + exp.pos +
                       "arguments to function did not match the function signature types");
        
        return signature.returnType;
    }
    
    @Override
    public Optional<type.Type> visit(ExpPredefinedCall exp) {
        Signature signature = Signatures.predefined.get(exp.funcName);
        List<type.Type> paramList = new ArrayList<>();

        for (Expression e : exp.arguments)
            paramList.add(e.accept(this).get());

        if (!signature.check(paramList))
            errors.add("At " + exp.pos +
                       "arguments to function did not match the function signature types");
        
        return signature.returnType;
    }
    
    @Override
    public Optional<type.Type> visit(ExpArrEnum array) {
        return Optional.empty();
    }

    private Optional<type.Type> visitListExpression(List<Expression> list) {
        return Optional.empty();
    }

    // ===========================================
    // Statements: Instructions
    // ===========================================
    @Override
    public Optional<type.Type> visit(StmIf stm) {
        if (stm.condition.accept(this).get() != type.Basic.BOOL) {
            errors.add("At " + stm.condition.pos +
                       " an expression of type boolean is expected."); 
        }
        
        stm.then_branch.accept(this);
        stm.else_branch.get().accept(this);

        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmAssign stm) {
        if(stm.lValue.accept(this).get() != stm.exp.accept(this).get()) {
            errors.add("At " + stm.pos + 
                " the type of left hand side must be the same as the right hand side.");
        }

        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmExp stm) {


        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmRead stm) {
        // I feel like there should be some sort of checking that a variable has been declared, but there is nothing in the class for variable name
        if(stm.type.type != stm.exp.accept(this).get()) {
            errors.add("At " + stm.pos + 
                " the type of the expression and the declared type must be the same.");
        }

        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmPrint stm) {
        if(stm.type.type != stm.exp.accept(this).get()) {
            errors.add("At " + stm.pos + 
                " the type of the expression and the declared type must be the same.");
        }

        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmReturn stm) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmWhile stm) {
        if (stm.condition.accept(this).get() != type.Basic.BOOL) {
            errors.add("At " + stm.condition.pos +
                       " an expression of type boolean is expected."); 
        }
        
        stm.body.accept(this);
        
        return Optional.empty();
    }

    @Override
    public Optional<type.Type> visit(StmFor stm) {
        return Optional.empty();
    }

    // ===========================================
    // Statements: Declaration
    // ===========================================
    @Override
    public Optional<type.Type> visit(StmDecl stm) {
        return Optional.empty();
    }

    // ===========================================
    // Block
    // ===========================================
    @Override
    public Optional<type.Type> visit(Block block) {
        for (Statement stm : block.statements)
            stm.accept(this);
        return Optional.empty();
    }

    // ===========================================
    // Function Definition
    // ===========================================

    @Override
    public Optional<type.Type> visit(FunctionDefinition func) {
        func.body.accept(this);
        Signature signature = symbolTable.funcLookup(func.name).get();
        
        return signature.returnType;
    }

    // ===========================================
    // Program
    // ===========================================
    @Override
    public Optional<type.Type> visit(Program program) {
        for (FunctionDefinition func : program.functions)
            func.accept(this);
        return Optional.empty();
    }
}

