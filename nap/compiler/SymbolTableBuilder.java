package compiler;

import ast.*;
import util.Pair;

import java.util.*;

public class SymbolTableBuilder implements Visitor<Type> {
    Map<String, Signature> signatures;
    Map<String, Type> types;

    public SymbolTableBuilder() {
        signatures = new HashMap<String, Signature>();
        types = new HashMap<String, Type>();
    }
    // ================================================
    // Expressions
    // ================================================
    public Type visit(ExpBool exp) {
        return null;
    }
    
    public Type visit(ExpChar exp) {
        return null;
    }
    
    public Type visit(ExpInt exp) {
        return null;
    }
    
    public Type visit(ExpString exp) {
        return null;
    }
        
    public Type visit(ExpVar exp) {
        return null;
    }
        
    public Type visit(ExpBinop exp) {
        return null;
    }

    public Type visit(ExpUnop exp) {
        return null;
    }

    public Type visit(ExpAssignop exp) {
        return null;
    }

    public Type visit(ExpFuncCall exp)
    {
        return null;
    }

    public Type visit(ExpPredefinedCall exp) {
        return null;
    }

    public Type visit(ExpNew exp) {
        return null;
    }

    public Type visit(ExpArrAccess exp) {
        return null;
    }

    public Type visit(ExpArrEnum exp) {
        return null;
    }
    
    // ================================================
    // Statements
    // ================================================

    public Type visit(StmIf stm) {
        return null;
    }

    public Type visit(StmAssign stm) {
        return null;
    }

    public Type visit(StmExp stm) {
        return null;
    }

    public Type visit(StmRead stm) {
        return null;
    }

    public Type visit(StmPrint stm) {
        return null;
    }

    public Type visit(StmReturn stm) {
        return null;
    }

    public Type visit(StmWhile stm) {
        return null;
    }

    public Type visit(StmFor stm) {
        return null;
    }

    public Type visit(StmDecl stm) {
        return null;
    }
    
    // ================================================
    // Type
    // ================================================

    public Type visit(Type type) {
        return null;
    }
    
    // ================================================
    // Block
    // ================================================

    public Type visit(Block block) {
        return null;
    }
    
    // ================================================
    // FunctionDefinition
    // ================================================

    public Type visit(FunctionDefinition func) {
        return null;
    }
    
    // ================================================
    // Program
    // ================================================

    public Type visit(Program progam) {
        return null;
    }
}

