// Using the new grammar he gave to us, the one in the man.

package compiler;

import ast.*;
import parser.*;

import java.util.*;
import javafx.util.*;

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

    @Override
    public Ast visitFunction_definition(napParser.Function_definitionContext ctx) {
        String name = ctx.Identifier().toString();
        List<Pair<Pair<String, Type>, Boolean>> arguments =
            new ArrayList<Pair<Pair<String, Type>, Boolean>>();
        TypBasic returnType = (TypBasic)visit(ctx.type());
        Block body = (Block)visit(ctx.block());

        napParser.ParametersContext params = ctx.parameters();

        for (napParser.ParameterContext param : params.parameter()) {
            String paramName = param.Identifier().toString();
            TypBasic paramType = (TypBasic)visit(ctx.type());
            Boolean ref = param.REF().equals(napParser.REF) ? true : false;

            Pair<String, Type> typeAndName = new Pair<>(paramName, paramType);
            Pair<Pair<String, Type>, Boolean> arg = new Pair<>(typeAndName, ref);
            
            arguments.add(arg);
        }

        if (ctx.type().toString().equals(""))
            return new FunctionDefinition(position(ctx), name,
                                          arguments, body);
        else
            return new FunctionDefinition(position(ctx), name,
                                          arguments, body, returnType);
    }

    @Override
    public Ast visitBlock(napParser.BlockContext ctx) {
        List<Statement> statements = new ArrayList<Statement>();

        for (napParser.StatementContext stmCtx : ctx.statement()) {
            Statement stm = (Statement)visit(stmCtx);
            statements.add(stm);
        }

        return new Block(position(ctx), statements);
    }
    
    //instr
    @Override 
    public Ast visitIAssign(napParser.IAssignContext ctx) {
        /*
        String var = ctx.Identifier().toString();
        Expression e = (Expression)visit(ctx.expr);
        return new StmAssign(position(ctx), var, e);
        */
        return null;
    }
    
    @Override 
    public Ast visitIFor(napParser.IForContext ctx) { 
        //TODO
        return null;
    }    
    
    @Override 
    public Ast visitIWhile(napParser.IWhileContext ctx) { 
        //TODO
        return null;
    } 
        
    @Override 
    public Ast visitIInput(napParser.IInputContext ctx) { 
        //TODO
        return null;
    } 
    @Override 
    public Ast visitIPrint(napParser.IPrintContext ctx) {
        TypBasic type = (TypBasic) visit(ctx.type());
        Expression e = (Expression) visit(ctx.expr());
        return new StmPrint(position(ctx), type, e); 
    }
    
    @Override 
    public Ast visitIIf(napParser.IIfContext ctx) { 
        //TODO
        return null;
    } 
    
    @Override 
    public Ast visitIReturn(napParser.IReturnContext ctx) { 
        //TODO
        return null;
    } 

    @Override 
    public Ast visitIExpr(napParser.IExprContext ctx) { 
        //TODO
        return null;
    } 

    //expr
    @Override
    public Ast visitEMuls(napParser.EMulsContext ctx) {
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1));
        if(ctx.op.getType() == napParser.MUL)
            return new ExpBinop(position(ctx), e0, OpBinary.MUL, e1);
        else if(ctx.op.getType() == napParser.DIV)
            return new ExpBinop(position(ctx), e0, OpBinary.DIV, e1);
        else
            return new ExpBinop(position(ctx), e0, OpBinary.MOD, e1);
    }

    @Override
    public Ast visitEAdds(napParser.EAddsContext ctx) {
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1));
        if(ctx.op.getType() == napParser.ADD)
            return new ExpBinop(position(ctx), e0, OpBinary.ADD, e1);
        else
            return new ExpBinop(position(ctx), e0, OpBinary.SUB, e1);
    }

    @Override
    public Ast visitEOpp(napParser.EOppContext ctx) {
        Expression e = (Expression)visit(ctx.expr());
        return new ExpUnop(position(ctx), e, OpUnary.SUB);
    }

    @Override
    public Ast visitECmp(napParser.ECmpContext ctx) {
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1)); 
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
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1));
        return new ExpBinop(position(ctx), e0, OpBinary.AND, e1);
    }

    @Override 
    public Ast visitEOr(napParser.EOrContext ctx) {
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1));
        return new ExpBinop(position(ctx), e0, OpBinary.OR, e1);
    }

    @Override 
    public Ast visitENot(napParser.ENotContext ctx) {
        Expression e = (Expression)visit(ctx.expr());
        return new ExpUnop(position(ctx), e, OpUnary.NOT);
    }

    @Override
    public Ast visitEPostfix(napParser.EPostfixContext ctx) {
        Expression e = (Expression)visit(ctx.expr());
        if(ctx.AssignOp().equals(napParser.INCR))
            return new ExpAssignop(position(ctx), OpAssign.INC, e, false);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, false); 
    }

    @Override
    public Ast visitEPrefix(napParser.EPrefixContext ctx) {
        Expression e = (Expression)visit(ctx.expr());
        if(ctx.AssignOp().equals(napParser.INCR))
            return new ExpAssignop(position(ctx), OpAssign.INC, e, true);
        else
            return new ExpAssignop(position(ctx), OpAssign.DEC, e, true);
    }

    //wtf
    @Override 
    public Ast visitECall(napParser.ECallContext ctx) {
        String id = ctx.Identifier().toString();
        //TODO
        return null;
    }

    @Override
    public Ast visitEIdentifier(napParser.EIdentifierContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitEInt(napParser.EIntContext ctx) {
        return new ExpInt(position(ctx), Integer.parseInt(ctx.Int().toString())); 
    }
    
    @Override
    public Ast visitEBool(napParser.EBoolContext ctx) {
        //TODO
        return null;
    }
        
    @Override
    public Ast visitEChar(napParser.ECharContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitEString(napParser.EStringContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitENew(napParser.ENewContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitEArrayAccess(napParser.EArrayAccessContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitEArrayEnumeration(napParser.EArrayEnumerationContext ctx) {
        //TODO
        return null;
    }
    
    @Override
    public Ast visitEPar(napParser.EParContext ctx) {
       	Expression e = (Expression) visit(ctx.expr());
        return e;
    }
}
