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
        Type returnType = (Type)visit(ctx.type());
        Block body = (Block)visit(ctx.block());

        // NOTE: Our AST doesn't have the concept of parameters,
        // so I decided to just inline the parsing of parameters here
        // instead of making two visit functions for them.
        napParser.ParametersContext params = ctx.parameters();

        for (napParser.ParameterContext param : params.parameter()) {
            String paramName = param.Identifier().toString();
            Type paramType = (Type)visit(ctx.type());
            // Not sure about this one
            Boolean ref = param.REF().equals(napParser.REF) ? true : false;

            Pair<String, Type> typeAndName = new Pair<>(paramName, paramType);
            Pair<Pair<String, Type>, Boolean> arg = new Pair<>(typeAndName, ref);
            
            arguments.add(arg);
        }

        // Not sure if this is how to handle empty types
        if (ctx.type() == null)
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
    
    @Override
    public Ast visitSDecl(napParser.SDeclContext ctx) {
        napParser.DeclarationContext decl = ctx.declaration();

        Type type = (Type)visit(decl.type());
        String name = decl.Identifier().toString();

        Expression init = (Expression)visit(decl.expr());

        // Not sure about this one either
        if (init != null)
            return new StmDecl(position(ctx), name, type);
        else
            return new StmDecl(position(ctx), name, type, init);
    }
    
    //Instructions
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
    public Ast visitIDoWhile(napParser.IDoWhileContext ctx) { 
        //TODO
        return null;
    } 
        
    @Override 
    public Ast visitIInput(napParser.IInputContext ctx) { 
        Expression e = (Expression) visit(ctx.expr());
        Type type = (Type) visit(ctx.type());
        return new StmRead(position(ctx), type, e);
    } 
    @Override 
    public Ast visitIPrint(napParser.IPrintContext ctx) {
        TypBasic type = (TypBasic) visit(ctx.type());
        Expression e = (Expression) visit(ctx.expr());
        return new StmPrint(position(ctx), type, e); 
    }
    
    @Override 
    public Ast visitIIf(napParser.IIfContext ctx) { 
        Expression e = (Expression) visit(ctx.expr());
        //TODO
        return null;
    } 
    
    @Override 
    public Ast visitIReturn(napParser.IReturnContext ctx) { 
        Expression e = (Expression) visit(ctx.expr);
        return new StmReturn(position(ctx), e);
    } 

    @Override 
    public Ast visitIExpr(napParser.IExprContext ctx) {
    	Expression e = (Expression) visit(ctx.expr);
        return new StmExp(position(ctx), e);
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

    @Override 
    public Ast visitECall(napParser.ECallContext ctx) {
        String name = ctx.Identifier().toString();
        List<Expression> args = new ArrayList<Expression>();
        
        napParser.ExpressionsContext exprsCtx = ctx.expressions();

        for (napParser.ExprContext exprCtx : exprsCtx.expr()) {
            Expression expr = (Expression)visit(exprCtx);
            args.add(expr);
        }
        
        return new ExpFuncCall(position(ctx), name, args);
    }
    @Override
    public Ast visitEIdentifier(napParser.EIdentifierContext ctx) {
        return new ExpVar(position(ctx), ctx.Identifier().toString());
    }
    
    @Override
    public Ast visitEInt(napParser.EIntContext ctx) {
        return new ExpInt(position(ctx), Integer.parseInt(ctx.Int().toString())); 
    }
    
    @Override
    public Ast visitEBool(napParser.EBoolContext ctx) {
        return new ExpBool(position(ctx), ctx.Bool().toString());
    }
        
    @Override
    public Ast visitEChar(napParser.ECharContext ctx) {
        return new ExpChar(position(ctx), ctx.Char().toString());
    }
    
    @Override
    public Ast visitEString(napParser.EStringContext ctx) {
        return new ExpString(position(ctx), ctx.String().toString());
    }
    
    @Override
    public Ast visitENew(napParser.ENewContext ctx) {
        TypBasic type = (TypBasic) visit(ctx.type());
        Expression e = (Expression) visit(ctx.expr());
        return new ExpNew(position(ctx), type, e); 
    }
    
    @Override
    public Ast visitEArrayAccess(napParser.EArrayAccessContext ctx) {
        Expression e0 = (Expression)visit(ctx.expr(0));
        Expression e1 = (Expression)visit(ctx.expr(1));
        return new ExpArrAccess(position(ctx), e0, e1);
    }
    
    @Override
    public Ast visitEArrayEnumeration(napParser.EArrayEnumerationContext ctx) {
        List<Expression> exps = new ArrayList<Expression>();
        
        for (napParser.ExpressionsContext expsCtx : ctx.expressions()) {
            Expression exp = (Expression)visit(expsCtx);
            exps.add(exp);
        }
        return new ExpArrEnum(position(ctx), exps);
    }
    
    @Override
    public Ast visitEPar(napParser.EParContext ctx) {
       	Expression e = (Expression) visit(ctx.expr());
        return e;
    }
    
    // Types
    @Override
    public Ast visitTInt(napParser.TIntContext ctx) {
        return new TypBasic(BasicType.INT);
    }

    @Override
    public Ast visitTBool(napParser.TBoolContext ctx) {
        return new TypBasic(BasicType.BOOL);
    }
    
    @Override
    public Ast visitTChar(napParser.TCharContext ctx) {
        return new TypBasic(BasicType.CHAR);
    }
    
    @Override
    public Ast visitTFloat(napParser.TFloatContext ctx) {
        return new TypBasic(BasicType.FLOAT);
    }
    
    @Override
    public Ast visitTArray(napParser.TArrayContext ctx) {
        return new TypArray((Type)visit(ctx.type()));
    }

}
