package compiler;

import ast.*;
import type.Basic;
import type.Array;
import util.Pair;

import java.util.*;

public class SymbolTableBuilder implements Visitor<Symbol> {
    Map<String, Signature> signatures;
    Map<String, Type> types;
    Stack<Block> blockStack;

    public SymbolTableBuilder() {
        signatures = new HashMap<String, Signature>();
        types = new HashMap<String, Type>();
        blockStack = new Stack<Block>();
    }

    // Helper functions
    private void addSymbolToEnv(Symbol symbol) {
        if (symbol.isType())
            types.put(symbol.binding, symbol.type);
        else if (symbol.isSignature())
            signatures.put(symbol.binding, symbol.signature);
    }
    
    private Signature getOpSignature(OpUnary op) {
        Signature result = null;
        switch (op) {
            case SUB:
                result = Signature.unaryArithmetic;
                break;
            case NOT:
                result = Signature.unaryBoolean;
                break;
        }

        return result;
    }

    private Signature getOpSignature(OpBinary op) {
        Signature result = null;
        switch (op) {
            case ADD:
            case SUB:
            case MUL:
            case DIV:
            case MOD:
                result = Signature.binaryArithmetic;
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                result = Signature.comparison;
                break;
            case NEQ:
            case EQ:
            case OR:
            case AND:
                result = Signature.binaryBoolean;
                break;                
        }

        return result;
    }
    
    
    // ================================================
    // Expressions
    // ================================================

    public Symbol visit(ExpUnop exp) {
        Symbol symbol = exp.exp.accept(this);
        Signature signature = getOpSignature(exp.op);
        
        return new Symbol(null, signature);
    }

    public Symbol visit(ExpAssignop exp) {
        Symbol expr = exp.exp.accept(this);
        //Signature signature = getOpSignature(exp.op);
        boolean prefix = exp.prefix;
        
        types.put(expr.binding, expr.type);

        return new Symbol();
    }

    public Symbol visit(ExpFuncCall exp) {
        for (Expression e : exp.arguments) {
            e.accept(this);
        }
        
        return new Symbol();
    }

    public Symbol visit(ExpPredefinedCall exp) {
        for(Expression expr : exp.arguments) {
            expr.accept(this);
        }
        return new Symbol();
    }

    public Symbol visit(ExpNew exp) {
        Symbol expr = exp.exp.accept(this);
        return new Symbol(null, exp.type);
    }

    public Symbol visit(ExpArrAccess exp) {
        Symbol array = exp.array.accept(this);
        Symbol index = exp.index.accept(this);
        
        return new Symbol();
    }

    public Symbol visit(ExpArrEnum exp) {
        for (Expression e : exp.exps) {
            e.accept(this);
        }
        return new Symbol();
    }
        
    public Symbol visit(ExpBinop exp) {
        Symbol left = exp.left.accept(this);
        Symbol right = exp.right.accept(this);
        Signature signature = getOpSignature(exp.op);
        return new Symbol(null, signature);
    }

    public Symbol visit(ExpBool exp) {
        // Won't compile?
        //return new Symbol(null, Basic.BOOL);
        return new Symbol();
    }
   
    public Symbol visit(ExpChar exp) {
        //return new Symbol(null, Basic.CHAR);
        return new Symbol();
    }
    
    public Symbol visit(ExpInt exp) {
        //return new Symbol(null, Basic.INT);
        return new Symbol();
    }
    
    public Symbol visit(ExpString exp) {
        //return new Symbol(null, Array);
        return new Symbol();
    }
        
    public Symbol visit(ExpVar exp) {
        //return new Symbol(exp.name, null);
        return new Symbol();
    }
    
    // ================================================
    // Statements
    // ================================================

    public Symbol visit(StmIf stm) {
        Symbol symbol = stm.condition.accept(this);
        //addSymbolToEnv(symbol);
        Symbol then_branch = stm.then_branch.accept(this);
        Symbol else_branch = stm.else_branch.get().accept(this);
        
        return new Symbol();
    }

    public Symbol visit(StmAssign stm) {
        Symbol lvalSymbol = stm.l_value.accept(this);
        addSymbolToEnv(lvalSymbol);
        Symbol expSymbol = stm.exp.accept(this);

        Signature signature = getOpSignature(stm.op.get());
        
        return new Symbol(null, signature);
    }

    public Symbol visit(StmExp stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol();
    }

    public Symbol visit(StmRead stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol(null, symbol.type);
    }

    public Symbol visit(StmPrint stm) {
        Symbol symbol = stm.type.accept(this);
        //addSymbolToEnv(symbol);
        return new Symbol(null, symbol.type);
    }

    public Symbol visit(StmReturn stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol(null, symbol.type);
    }

    public Symbol visit(StmWhile stm) {
        Symbol body = stm.body.accept(this);
        Symbol symbol = stm.condition.accept(this);

        return new Symbol(null, symbol.type);
    }

    public Symbol visit(StmFor stm) {
        Symbol symbol = stm.collection.accept(this);
        Symbol body = stm.body.accept(this);
        String var = stm.var;
        return new Symbol(null, stm.type);
    }

    public Symbol visit(StmDecl stm) {
        // What to do with this
        Symbol symbol = stm.initialization.get().accept(this);
        
        String name = stm.binding.getFst();
        Type type = stm.binding.getSnd();

        types.put(name, type);
        
        return new Symbol(name, type);
    }
    
    // ================================================
    // Type
    // ================================================

    public Symbol visit(Type type) {
        return new Symbol();
    }
    
    // ================================================
    // Block
    // ================================================

    public Symbol visit(Block block) {
        blockStack.push(block);
        for (Statement stm : block.statements) {
            stm.accept(this);
        }
        blockStack.pop();
        return new Symbol();
    }
    
    // ================================================
    // FunctionDefinition
    // ================================================

    public Symbol visit(FunctionDefinition func) {
        String funcName = func.name;
        List<Pair<Pair<String, Type>, Boolean>> args = func.arguments;
        // TODO: Might need to handle the optional
        Type returnType = func.returnType.get();
        Block funcBlock = func.body;

        List<Pair<Type, Boolean>> argTypes = new ArrayList<>();
        
        // Add each argument to the environment
        for (Pair<Pair<String, Type>, Boolean> arg : args) {
            Boolean isRef = arg.getSnd();
            Pair<String, Type> binding = arg.getFst();
            
            types.put(binding.getFst(), binding.getSnd());
            argTypes.add(new Pair(binding.getSnd(), isRef));
        }

        signatures.put(funcName, new Signature(argTypes, returnType));
        return new Symbol(funcName, new Signature(argTypes, returnType));
    }
    
    // ================================================
    // Program
    // ================================================

    public Symbol visit(Program program) {
        for (FunctionDefinition func : program.functions) {
            func.accept(this);
        }
        return new Symbol();
    }
}

