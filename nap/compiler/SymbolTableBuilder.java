package compiler;

import ast.*;
import util.Pair;

import java.util.*;

public class SymbolTableBuilder implements Visitor<Symbol> {
    Map<String, Signature> signatures;
    Map<String, Type> types;
    Stack<Map<String, Type>> localTableStack;

    public SymbolTableBuilder() {
        signatures = new HashMap<String, Signature>();
        types = new HashMap<String, Type>();
        localTableStack = new Stack<Map<String, Type>>();
    }
    
    // ================================================
    // Expressions
    // ================================================
    public Symbol visit(ExpBool exp) {
        return null;
    }
   
    public Symbol visit(ExpChar exp) {
        return null;
    }
    
    public Symbol visit(ExpInt exp) {
        return null;
    }
    
    public Symbol visit(ExpString exp) {
        return null;
    }
        
    public Symbol visit(ExpVar exp) {
        return null;
    }
        
    public Symbol visit(ExpBinop exp) {
        return null;
    }

    public Symbol visit(ExpUnop exp) {
        return null;
    }

    public Symbol visit(ExpAssignop exp) {
        return null;
    }

    public Symbol visit(ExpFuncCall exp)
    {
        return null;
    }

    public Symbol visit(ExpPredefinedCall exp) {
        return null;
    }

    public Symbol visit(ExpNew exp) {
        return null;
    }

    public Symbol visit(ExpArrAccess exp) {
        return null;
    }

    public Symbol visit(ExpArrEnum exp) {
        return null;
    }
    
    // ================================================
    // Statements
    // ================================================

    public Symbol visit(StmIf stm) {
        return null;
    }

    public Symbol visit(StmAssign stm) {
        return null;
    }

    public Symbol visit(StmExp stm) {
        return null;
    }

    public Symbol visit(StmRead stm) {
        return null;
    }

    public Symbol visit(StmPrint stm) {
        return null;
    }

    public Symbol visit(StmReturn stm) {
        return null;
    }

    public Symbol visit(StmWhile stm) {
        return null;
    }

    public Symbol visit(StmFor stm) {
        return null;
    }

    public Symbol visit(StmDecl stm) {
        return null;
    }
    
    // ================================================
    // Type
    // ================================================

    public Symbol visit(Type type) {
        return null;
    }
    
    // ================================================
    // Block
    // ================================================

    public Symbol visit(Block block) {
        return null;
    }
    
    // ================================================
    // FunctionDefinition
    // ================================================

    public Symbol visit(FunctionDefinition func) {
        String funcName = func.name;
        List<Pair<Pair<String, Type>, Boolean>> args = func.arguments;
        // TODO: Might need to handle the optional
        Type returnType = func.returnType.accept(this);
        Block funcBlock = func.block.accept(this);

        List<Type, Boolean> argTypes = new ArrayList<>();
        
        // Add each argument to the environment
        for (Pair<Pair<String, Type>, Boolean> arg : args) {
            Boolean isRef = arg.getSnd();
            Pair<String, Type> binding = arg.getFst();
            
            types.put(binding.getFst(), binding.getSnd());
            argTypes.add(binding.getSnd(), isRef);
        }

        signatures.put(funcName, new Signature(argTypes, returnType);
        return new Symbol(new Signature(argTypes, returnType));
    }
    
    // ================================================
    // Program
    // ================================================

    public Symbol visit(Program progam) {
        for (FunctionDefinition func : program.functions) {
            func.accept(this);
        }
        return new Symbol();
    }
}

