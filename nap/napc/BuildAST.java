package napc;
import parser.*;

import ast.*;

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
        List<Function> program = new ArrayList<Function>();

        for (ParseTree child : ctx.children) {
            Ast i = visit(child);
            if (i != null && i instanceof Function)
                program.add((Function)i);
        }
        return new Program(position(ctx), program);
    }

    // TODO: Other types of Assigns
    @Override
    public Ast visitAssign(napParser.AssignContext ctx) {
        String var_name = ctx.Identifier().toString();
        Expr e = (Expr) visit(ctx.expr());
        return new Assign(position(ctx), var_name, e);
    }

    @Override
    public Ast visitPrint(napParser.PrintContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        return new Print(position(ctx), e);
    }

    @Override
    public Ast visitRead(napParser.ReadContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        return new Read(position(ctx), e);
    }

    @Override
    public Ast visitReturn(napParser.ReturnContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        return new Return(position(ctx), e);
    }

    @Override
    public Ast visitNewInline(napParser.NewInlineContext ctx) {
        String var_name = ctx.Identifier.toString();
        //TODO: Figure out typing
        // Assume integer for now.
        Type type = Type.INT;
        int count = Integer.parseInt(ctx.Constant().toString());
        return new New(position(ctx), var_name, type, count);
    }

    @Override
    public Ast visitNew(napParser.NewContext ctx) {
        String var_name = ctx.Identifier.toString();
        //TODO: Figure out typing
        // Assume integer for now.
        Type type = Type.INT;
        int count = Integer.parseInt(ctx.Constant().toString());
        return new New(position(ctx), var_name, type, count);
    }

    @Override
    public Ast visitIfCond(napParser.IfCondContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        List<Instruction> instructions = new ArrayList<Instruction>();
        for (ParseTree child : ctx.children) {
            Ast i = visit(child);
            if (i != null && i instanceof Instruction) {
                instructions.add((Instruction)i);
            }
        }
        return new IfCond(position(ctx), e, instructions);
    }

    @Override
    public Ast visitElseCond(napParser.ElseCondContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        List<Instruction> instructions = new ArrayList<Instruction>();
        for (ParseTree child : ctx.children) {
            Ast i = visit(child);
            if (i != null && i instanceof Instruction) {
                instructions.add((Instruction)i);
            }
        }
        return new ElseCond(position(ctx), e, instructions);
    }

    @Override
    public Ast visitElseIfCond(napParser.ElseIfCondContext ctx) {
        Expr e = (Expr) visit(ctx.expr());
        List<Instruction> instructions = new ArrayList<Instruction>();
        for (ParseTree child : ctx.children) {
            Ast i = visit(child);
            if (i != null && i instanceof Instruction) {
                instructions.add((Instruction)i);
            }
        }
        return new ElseIfCond(position(ctx), e, instructions);
    }

    @Override
    public Ast visitAddSub(napParser.AddSubContext ctx) {
        Expr e0 = (Expr) visit(ctx.expr(0));
        Expr e1 = (Expr) visit(ctx.expr(1));
        if (ctx.op.getType() == napLexer.ADD)
            return new ExprBinop(position(ctx), e0, Binop.ADD, e1);
        else
            return new ExprBinop(position(ctx), e0, Binop.SUB, e1);
    }

    @Override
    public Ast visitMulDiv(napParser.MulDivContext ctx) {
        Expr e0 = (Expr) visit(ctx.expr(0));
        Expr e1 = (Expr) visit(ctx.expr(1));
        if (ctx.op.getType() == napLexer.MUL)
            return new ExprBinop(position(ctx), e0, Binop.MUL, e1);
        else
            return new ExprBinop(position(ctx), e0, Binop.DIV, e1);
    }

    @Override
    public Ast visitInequality(napParser.InequalityContext ctx) {
        Expr e0 = (Expr) visit(ctx.expr(0));
        Expr e1 = (Expr) visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case napLexer.GT:
                return new ExprInequality(position(ctx), e0, Inequality.GT, e1);
                break;
            case napLexer.LT:
                return new ExprInequality(position(ctx), e0, Inequality.LT, e1);
                break;
            case napLexer.LTEQ:
                return new ExprInequality(position(ctx), e0, Inequality.LTEQ, e1);
                break;
            case napLexer.GTEQ:
                return new ExprInequality(position(ctx), e0, Inequality.GTEQ, e1);
                break;
        }
    }

    @Override
    public Ast visitNegation(napParser.NegationContext ctx) {
        Expr e = (Expr).visit(ctx.expr);
        switch (ctx.op.getType()) {
            case napLexer.NEG:
                return new ExprNegation(position(ctx), Negation.NEG);
                break;
            case napLexer.LNEG:
                return new ExprNegation(position(ctx), Negation.LNEG);
                break;
        }
    }

    @Override
    public Ast visitLogical(napParser.LogicalContext ctx) {
        Expr e0 = (Expr) visit(ctx.expr(0));
        Expr e1 = (Expr) visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case napLexer.LNOT:
                return new ExprLogical(position(ctx), e0, Logical.LNOT, e1);
                break;
            case napLexer.LOR:
                return new ExprLogical(position(ctx), e0, Logical.LOR, e1);
                break;
            case napLexer.LAND:
                return new ExprLogical(position(ctx), e0, Logical.LAND, e1);
                break;
        }
    }

    @Override
    public Ast visitEquality(napParser.EqualityContext ctx) {
        Expr e0 = (Expr) visit(ctx.expr(0));
        Expr e1 = (Expr) visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case napLexer.EQ:
                return new ExprEquality(position(ctx), e0, Logical.EQ, e1);
                break;
            case napLexer.NEQ:
                return new ExprEquality(position(ctx), e0, Logical.NEQ, e1);
                break;
        }
    }

    @Override
    public Ast visitIdentifier(napParser.IdentifierContext ctx) {
        return new ExprIdentifier(position(ctx), ctx.Identifier().toString());
    }

    @Override
    public Ast visitInt(napParser.ConstantContext ctx) {
        return new ExprInt(position(ctx),
                           Integer.parseInt(ctx.Constant().toString()));
    }

    @Override
    public Ast visitChar(napParser.CharacterConstantContext ctx) {
        return new ExprChar (position(ctx),
                            ctx.CharacterConstant().toString());
    }

    @Override
    public Ast visitBoolean(napParser.BooleanConstantContext ctx) {
        String boolValue = ctx.BooleanConstant().toString();
        if (boolValue.compare(boolValue, "T")) {
            return new ExprBoolean(position(ctx), 'T');
        } else {
            return new ExprBoolean(position(ctx), 'F');
        }
    }

    public Ast visitString(napParser.StringConstantContext ctx) {
        String str = ctx.StringConstant().toString();
        return new ExprString(position(ctx), str);
    }
}
