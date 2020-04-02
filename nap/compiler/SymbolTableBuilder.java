package compiler;

import ast.*;
import util.Pair;

import java.util.*;

public class SymbolTableBuilder implements Visitor<Symbol> {
    Map<String, Signature> signatures;
    Map<String, Type> types;
    Stack<Block> blockStack;

    public SymbolTableBuilder() {
        signatures = new HashMap<String, Signature>();
        types = new HashMap<String, Type>();
        block = new Stack<Block>();
    }

    // Helper functions
    private void addSymbolToEnv(Symbol symbol) {
        if (symbol.isType())
            types.put(symbol.binding, symbol.type);
        else if (symbol.isSignature())
            signatures.put(symbol.binding, symbol.signature);
    }

    private Signature getOpSignature(OpUnary op) {
        Signature result;
        switch (op) {
            case OpUnary.SUB:
                result = Signature.unaryArithmetic;
                break;
            case OpUnary.NOT:
                result = Signature.unaryBoolean;
                break;
        }

        return result;
    }

    private Signature getOpSignature(OpBinary op) {
        Signature result;
        switch (op) {
            case OpBinary.ADD:
            case OpBinary.SUB:
            case OpBinary.MUL:
            case OpBinary.DIV:
            case OpBinary.MOD:
                result = Signature.binaryArithmetic;
                break;
            case OpBinary.LT:
            case OpBinary.GT:
            case OpBinary.LE:
            case OpBinary.GE:
            case OpBinary.NEQ:
            case OpBinary.EQ:
            case OpBinary.OR:
            case OpBinary.AND:
                result = Signature.binaryComparison;
                break;                
        }

        return result;
    }
    
    
    // ================================================
    // Expressions
    // ================================================

    public Symbol visit(ExpUnop exp) {
        Symbol symbol = exp.exp.accept(this);
        // What do we do with this
        Signature signature = getOpSignature(exp.op);

        // This has no name to bind to so I think we just visit the
        // expression
        //signatures.put(symbol.binding, signature);
        
        return new Symbol(null, signature);
    }

    public Symbol visit(ExpAssignop exp) {
        Symbol expr = exp.exp.accept(this);
        Signature signature = getOpSignature(exp.op);
        boolean prefix = exp.prefix;
        return new Symbol(null, signature);
    }

    public Symbol visit(ExpFuncCall exp) {
        Symbol args = exp.arguments.accept(this);
        return new Symbol(exp.funcName, null);
    }

    public Symbol visit(ExpPredefinedCall exp) {
        return new Symbol();
    }

    public Symbol visit(ExpNew exp) {
        Symbol expr = exp.exp.accept(this);
        return new Symbol(null, exp.type);
    }

    public Symbol visit(ExpArrAccess exp) {
        Symbol array = exp.array.accept(this);
        Symbol index = exp.index.accept(this);
        return new Symbol(null, null); //??
    }

    public Symbol visit(ExpArrEnum exp) {
        Symbol exprs = exp.exprs.accept(this);
        return new Symbol(null, null); //??
    }
        
    public Symbol visit(ExpBinop exp) {
        Symbol left = exp.left.accept(this);
        Symbol right = exp.right.accept(this);
        Signature signature = getOpSignature(exp.op);
        return new Symbol(null, signature);
    }

    public Symbol visit(ExpBool exp) {
        return new Symbol(null, Basic.BOOL);
    }
   
    public Symbol visit(ExpChar exp) {
        return new Symbol(null, Basic.CHAR);
    }
    
    public Symbol visit(ExpInt exp) {
        return new Symbol(null, Basic.INT);
    }
    
    public Symbol visit(ExpString exp) {
        return new Symbol(null, Array);
    }
        
    public Symbol visit(ExpVar exp) {
        return new Symbol(exp.name, null);
    }
    
    // ================================================
    // Statements
    // ================================================

    public Symbol visit(StmIf stm) {
        Symbol symbol = stm.condition.accept(this);
        //addSymbolToEnv(symbol);
        Block then_branch = stm.then_branch.accept(this);
        Block else_branch = stm.else_branch.accept(this);
        
        return new Symbol();
    }

    public Symbol visit(StmAssign stm) {
        Symbol lvalSymbol = stm.l_value.accept(this);
        addSymbolToEnv(lvalSymbol);
        Symbol expSymbol = stm.exp.accept(this);

        Signature signature = getOpSignature(stm.op);
        
        return new Symbol(null, signature);
    }

    public Symbol visit(StmExp stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol();
    }

    public Symbol visit(StmRead stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol(null, stm.type);
    }

    public Symbol visit(StmPrint stm) {
        Symbol symbol = stm.type.accept(this);
        addSymbolToEnv(symbol);
        return new Symbol(null, stm.type);
    }

    public Symbol visit(StmPrint stm) {
        Symbol symbol = stm.type.accept(this);
        addSymbolToEnv(symbol);
        return new Symbol(null, stm.type);
    }

    public Symbol visit(StmReturn stm) {
        Symbol symbol = stm.exp.accept(this);
        return new Symbol();
    }

    public Symbol visit(StmWhile stm) {
        return null;
    }

    public Symbol visit(StmFor stm) {
        Symbol symbol = stm.collection.accept(this);
        Block body = stm.body.accept(this);
        String var = stm.var;
        return new Symbol(null, stm.type);
    }

    public Symbol visit(StmDecl stm) {
        return null;
    }
    
    // ================================================
    // Type
    // ================================================

    public Symbol visit(Type type) {
        return Symbol();
    }
    
    // ================================================
    // Block
    // ================================================

    public Symbol visit(Block block) {
        blockStack.push(this);
        for (Statement stm : block.statements) {
            stm.accept(this);
        }
        blockStack.pop(this);
        return new Symbol();
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

