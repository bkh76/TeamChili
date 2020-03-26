// Using the new grammar he gave to us, the one in the man.

package compiler;

import ast.*;
import parser.*;

import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.NotNull;

public class BuildAST extends napBaseVisitor<Ast> {

    public static Position position(ParserRuleContext ctx) {
        Position pos = new Position(ctx.start.getLine(),
                                    ctx.start.getCharPositionInLine());
        return pos;
    }

    @Override
    public Ast visitProgram(napParser.ProgramContext ctx) {
        List<FunctionDefinition> functions = new ArrayList<FunctionDefinition>();
        for (ParseTree child : ctx.children) {
            Ast func = visit(child);
            if (func != null && func instanceof FunctionDefinition)
                functions.add((FunctionDefinition)func);
        }

        return new Program(position(ctx), functions);
    }

    public Ast visitFunctionDefinition(napParser.Function_DefinitionContext ctx) {
        //TODO(Trey)
    }
    
    //instr
    @Override 
    public Ast visitIAssign(napParser.IAssignContext ctx) { 
        String var = ctx.Identifier().toString();
        Expression e = (Expression)visit(ctx.expression());
        return new Assign(position(ctx), var, e); 
    }
    
    @Override 
    public Ast visitIFor(napParser.IForContext ctx) { 
        //TODO
    }    
    
    @Override 
    public Ast visitIWhile(napParser.IWhileContext ctx) { 
        //TODO
    } 
    
    @Override 
    public Ast visitIDoWhile(napParser.IDoWhileContext ctx) { 
        //TODO
    } 
    
    @Override 
    public Ast visitIInput(napParser.IInputContext ctx) { 
        //TODO
    } 
    @Override 
    public Ast visitIPrint(napParser.IPrintContext ctx) {
        Expression e = (Expression) visit(ctx.expression());
        return new Print(position(ctx), e); 
    }
    
    @Override 
    public Ast visitIIf(napParser.IIfContext ctx) { 
        //TODO
    } 
    
    @Override 
    public Ast visitIReturn(napParser.IReturnContext ctx) { 
        //TODO
    } 

    @Override 
    public Ast visitIExpr(napParser.IExprContext ctx) { 
        //TODO
    } 

    //expr
    @Override
    public Ast visitEMuls(napParser.EMulsContext ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        if(ctx.op.getType() == napParser.MUL)
            return new ExpBinop(position(ctx), e0, OpBinary.MUL, e1);
        else if(ctx.op.getType() == napParser.DIV)
            return new ExpBinop(position(ctx), e0, OpBinary.DIV, e1);
        else
            return new ExpBinop(position(ctx), e0, OpBinary.MOD, e1);
    }

    @Override
    public Ast visitEAdds(napParser.EAddsContext ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        if(ctx.op.getType() == napParser.ADD)
            return new ExpBinop(position(ctx), e0, OpBinary.ADD, e1);
        else
            return new ExpBinop(position(ctx), e0, OpBinary.SUB, e1);
    }

    @Override
    public Ast visitEOpp(napParser.EOppContext ctx) {
        Expression e = (Expression)visit(ctx.expressin(0));
        return new ExpUnop(position(ctx), e, OpUnary.SUB);
    }

    @Override
    public Ast visitECmp(napParser.ECmpContext ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1)); 
        if(ctx.op.getType() == napParser.EQ)
            return new ExpBinop(position(ctx), e0, OpBinary.EQ, e1);
        else if(ctx.op.getType() == napParser.NEQ)
            return new ExpBinop(position(ctx), e0, OpBinary.NEQ, e1);
        else if(ctx.op.getType() == napParser.LT)
            return new ExpBinop(position(ctx), e0, OpBinary.LT, e1);
        else if(ctx.op.getType() == napParser.LE)
            return new ExpBinop(position(ctx), e0, OpBinary.LE, e1);
        else if(ctx.op.getType() == napParser.GT)
            return new ExpBinop(position(ctx), e0, OpBinary.GT, e1);
        else
            return new ExpBinop(position(ctx), e0, OpBinary.GE, e1);
    }

    @Override
    public Ast visitEAnd(napParser.EAndContext ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        return new ExpBinop(position(ctx), e0, OpBinary.AND, e1);
    }

    @Override 
    public Ast visitEOr(napParser.EOrContext ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        return new ExpBinop(position(ctx), e0, OpBinary.OR, e1);
    }

    @Override 
    public Ast visitENot(napParser.ENotContext ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        return new ExpUnop(position(ctx), e, OpUnary.NOT);
    }

    @Override
    public Ast visitEPostfix(napParser.EPostfixContext ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        if(ctx.op.getType() == napParser.INC)
            return new ExpAssignop(position(ctx), OpAssign.INC, e, false);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, false); 
    }

    @Override
    public Ast visitEPrefix(napParser.EPrefixContext ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        if(ctx.op.getType() == napParser.INC)
            return new ExpAssignop(position(ctx), OpAssign.INC, e, true);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, true);
    }

    //wtf
    @Override 
    public Ast visitECall(napParser.ECallContext ctx) {
        String id = (String)visit(ctx.id()); // id is a method in the ECallContext class
        //TODO
    }

    @Override
    public Ast visitEIdentifier(napParser.EIdentifierContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitEInt(napParser.EIntContext ctx) {
       return new ExpInt(position(ctx), Integer.parseInt(ctx.Constant().toString())); 
    }
    
    @Override
    public AST visitEBool(napParser.EBoolContext ctx) {
        //TODO
    }
        
    @Override
    public AST visitEChar(napParser.ECharContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitEString(napParser.EStringContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitENew(napParser.ENewContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitEArrayAccess(napParser.EArrayAccessContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitEArrayEnumeration(napParser.EArrayEnumerationContext ctx) {
        //TODO
    }
    
    @Override
    public AST visitEPar(napParser.EParContext ctx) {
       	Expression e = (Expression) visit(ctx.expression());
        return e;
    }
}
