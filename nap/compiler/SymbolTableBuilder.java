package compiler;

import ast.*;
import util.Pair;

import java.util.*;

// Not sure what the type for Visitor<T> should be
// Putting Object as a placeholder
public class SymbolTableBuilder implements Visitor<Object>
{
    // ================================================
    // Expressions
    // ================================================
    public Object visit(ExpBool exp)
    {
        return null;
    }
    
    public Object visit(ExpChar exp)
    {
        return null;
    }
    
    public Object visit(ExpInt exp)
    {
        return null;
    }
    
    public Object visit(ExpString exp)
    {
        return null;
    }
        
    public Object visit(ExpVar exp)
    {
        return null;
    }
        
    public Object visit(ExpBinop exp)
    {
        return null;
    }

    public Object visit(ExpUnop exp)
    {
        return null;
    }

    public Object visit(ExpAssignop exp)
    {
        return null;
    }

    public Object visit(ExpFuncCall exp)
    {
        return null;
    }

    public Object visit(ExpPredefinedCall exp)
    {
        return null;
    }

    public Object visit(ExpNew exp)
    {
        return null;
    }

    public Object visit(ExpArrAccess exp)
    {
        return null;
    }

    public Object visit(ExpArrEnum exp)
    {
        return null;
    }
    
    // ================================================
    // Statements
    // ================================================

    public Object visit(StmIf stm)
    {
        return null;
    }

    public Object visit(StmAssign stm)
    {
        return null;
    }

    public Object visit(StmExp stm)
    {
        return null;
    }

    public Object visit(StmRead stm)
    {
        return null;
    }

    public Object visit(StmPrint stm)
    {
        return null;
    }

    public Object visit(StmReturn stm)
    {
        return null;
    }

    public Object visit(StmWhile stm)
    {
        return null;
    }

    public Object visit(StmFor stm)
    {
        return null;
    }

    public Object visit(StmDecl stm)
    {
        return null;
    }
    
    // ================================================
    // Type
    // ================================================

    public Object visit(Type type)
    {
        return null;
    }
    
    // ================================================
    // Block
    // ================================================

    public Object visit(Block block)
    {
        return null;
    }
    
    // ================================================
    // FunctionDefinition
    // ================================================

    public Object visit(FunctionDefinition func)
    {
        return null;
    }
    
    // ================================================
    // Program
    // ================================================

    public Object visit(Program progam)
    {
        return null;
    }
}

