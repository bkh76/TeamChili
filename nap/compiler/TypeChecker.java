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
    public Optional<type.Type> visit(Type type) {
        switch(type.type) {
            case INT:   return type.Basic.INT;
            case BOOL:  return type.Basic.BOOL;
            case BYTE:  return type.Basic.BYTE;
            case FLOAT: return type.Basic.FLOAT;
            case CHAR:  return type.Basic.CHAR;
        }
        return Optional.empty(); 
    }

    // ===========================================
    // Expressions: Literals
    // ===========================================
    @Override
    public Optional<type.Type> visit(ExpBool exp) { return Optional.empty(); }
    @Override
    public Optional<type.Type> visit(ExpChar exp) { return Optional.empty(); }
    @Override
    public Optional<type.Type> visit(ExpInt exp) { return Optional.empty(); }
    @Override
    public Optional<type.Type> visit(ExpString exp) { return Optional.empty(); }

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

        switch (exp.op) {
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case LT:
            case GT:
            case LE:
            case GE:
            case MOD: {
                if (left != type.Basic.INT) 
                    errors.add("At " +  exp.left.pos +
                               "the left expression in operation" + exp.op +
                               "does not have type int");
                else if (right != type.Basic.INT)
                    errors.add("At " +  exp.right.pos +
                               "the right expression in operation" + exp.op +
                               "does not have type int");               
            } break;
                
            case AND:
            case OR: {
                if (left != type.Basic.BOOL) 
                    errors.add("At " +  exp.left.pos +
                               "the left expression in operation" + exp.op +
                               "does not have type bool");
                else if (right != type.Basic.BOOL)
                    errors.add("At " +  exp.right.pos + 
                               "the right expression in operation" + exp.op +
                               "does not have type bool");                               
            } break;

            case NEQ:
            case EQ: {
                if (left != right)
                    errors.add("At " +  exp.left.pos +
                               "the left expression in operation" + exp.op +
                               "does not match the type on the right");
            } break;
        }
        
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpArrAccess exp) {
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
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpAssignop exp) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpFuncCall exp) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpPredefinedCall exp) {
        return Optional.empty();
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
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmExp stm) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmRead stm) {
        
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(StmPrint stm) {
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
        return Optional.empty();        
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

