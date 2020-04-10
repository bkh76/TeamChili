package compiler;

import ast.*;
import util.Pair;

import java.util.*;

import type.Type;

public class TypeChecker extends ErrorList implements Visitor<Type>
{
    // ===========================================
    // Errors
    // ===========================================
    private List<String> errors;
    
    public boolean hasErrors() { return !errors.isEmpty(); }
    
    public List<String> errors() { return errors; }

    // ===========================================
    // Types
    // ===========================================
    @Override
    public Type visit(Type type) { return null; }

    // ===========================================
    // Expressions: Literals
    // ===========================================
    @Override
    public Type visit(ExpBool exp) { return null; }
    @Override
    public Type visit(ExpChar exp) { return null; }
    @Override
    public Type visit(ExpInt exp) { return null; }
    @Override
    public Type visit(ExpString exp) { return null; }

    // ===========================================
    // Other Expressions
    // ===========================================
    @Override
    public Type visit(ExpVar exp) {
    }
    
    @Override
    public Type visit(ExpBinop exp) {
    }
    
    @Override
    public Type visit(ExpArrAccess exp) {
    }
    
    @Override
    public Type visit(ExpNew exp) {
    }
    
    @Override
    public Type visit(ExpUnop exp) {
    }
    
    @Override
    public Type visit(ExpAssignop exp) {
    }
    
    @Override
    public Type visit(ExpFuncCall exp) {
    }
    
    @Override
    public Type visit(ExpPredefinedCall exp) {
    }
    
    @Override
    public Type visit(ExpArrEnum array) {
    }

    private Type visitListExpression(List<Expression> list) {
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
    public Type visit(StmAssign stm) {
    }
    
    @Override
    public Type visit(StmExp stm) {
    }
    
    @Override
    public Type visit(StmRead stm) {
    }
    
    @Override
    public Type visit(StmPrint stm) {
    }
    
    @Override
    public Type visit(StmReturn stm) {
    }
    
    @Override
    public Type visit(StmWhile stm) {
    }

    @Override
    public Type visit(StmFor stm) {
    }

    // ===========================================
    // Statements: Declaration
    // ===========================================
    @Override
    public Type visit(StmDecl stm) {
    }

    // ===========================================
    // Block
    // ===========================================
    @Override
    public Type visit(Block block) {
    }

    // ===========================================
    // Function Definition
    // ===========================================
    private Signature signatureOf(FunctionDefinition fun){
    }

    @Override
    public Type visit(FunctionDefinition fun) {
        return null;
    }

    // ===========================================
    // Program
    // ===========================================
    @Override
    public Type visit(Program program) {
        return null;
    }
}
