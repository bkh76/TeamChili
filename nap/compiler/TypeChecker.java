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
    public Optional<type.Type> visit(Type type) { return Optional.empty(); }

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
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpArrAccess exp) {
        return Optional.empty();
    }
    
    @Override
    public Optional<type.Type> visit(ExpNew exp) {
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
        if (stm.condition.accept(this) != type.Type.BOOL ||
            stm.condition.accept(this) != type.Type.INT) { //we allow int flags, yes?
            errors.add("At " + stm.condition.pos +
                       " an expression of type boolean or integer is expected."); 
        }
        
        stm.then_branch.accept(this);
        stm.else_branch.accept(this);

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
