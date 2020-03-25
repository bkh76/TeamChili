// Using the new grammar he gave to us, the one in the man.

package nap;

import ast.*;
import parser.*;

import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.NotNull;

public class BuildAST extends napBaseVisitor<Ast>{
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
    public Ast visitEOpp(napParser.EOpp ctx) {
        Expression e = (Expression)visit(ctx.expressin(0));
        return new ExpUnop(position(ctx), e, OpUnary.SUB);
    }

    @Override
    public Ast visitECmp(napParser.ECmp ctx) {
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
    public Ast visitEAnd(napParser.EAnd ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        return new ExpBinop(position(ctx), e0, OpBinary.AND, e1);
    }

    @Override 
    public Ast visitEOr(napParser.EOr ctx) {
        Expression e0 = (Expression)visit(ctx.expression(0));
        Expression e1 = (Expression)visit(ctx.expression(1));
        return new ExpBinop(position(ctx), e0, OpBinary.OR, e1);
    }

    @Override 
    public Ast visitENot(napParser.ENot ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        return new ExpUnop(position(ctx), e, OpUnary.NOT);
    }

    @Override
    public Ast visitEPostfix(napParser.EPostfix ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        if(ctx.op.getType() == napParser.INC)
            return new ExpAssignop(position(ctx), OpAssign.INC, e, false);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, false); 
    }

    @Override
    public Ast visitEPrefix(napParser.EPrefix ctx) {
        Expression e = (Expression)visit(ctx.expression(0));
        if(ctx.op.getType() == napParser.INC)
            return new ExpAssignop(position(ctx), OpAssign.INC, e, true);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, true);
    }

    //wtf
    @Override 
    public Ast visitECall(napParser.ECall ctx) {
        String id = (String)visit(ctx.id()); // id is a method in the ECallContext class
        for(napParser.)
    }

    @Override
    public Ast visitEIdentifier
}