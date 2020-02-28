package picoc;

import ast.*;
import java.util.*;


public class Main {

    public final Position pos = new Position(0, 0);

    static Program discriminant() {
        // num_solutions
        List<ExprIdentifier> args1 = new ArrayList<ExprIdentifier>();
        args1.add(new ExprIdentifier(pos, Type.INT, "a"));
        args1.add(new ExprIdentifier(pos, Type.INT, "b"));
        args1.add(new ExprIdentifier(pos, Type.INT, "c"));

        Type returnType = Type.INT;

        List<Instruction> insList1 = new ArrayList<Instruction>();
        insList1.add(new Assign(pos, "d",
        new ExpBinop(pos,
                    new ExpBinop(pos, new ExpVar(pos, "b"),
                                 Binop.MUL, new ExpVar(pos, "b")),
                    Binop.SUB,
                    new ExpBinop(pos,
                                 new ExpBinop(pos, new ExpInt(pos, 4),
                                              Binop.MUL,
                                              new ExpVar(pos,"a")),
                                 Binop.MUL,
                                 new ExpVar(pos, "c")))));

        List<Instruction ifInsList1 = new ArrayList<Instruction>();
        ifInsList1.add(new Return(pos, new ExprInt(pos, 0)));
        List<Instruction ifInsList2 = new ArrayList<Instruction>();
        ifInsList2.add(new Return(pos, new ExprInt(pos, 1)));

        insList1.add(new IfCond(pos,
                               new ExprInequality(pos,
                                                  new ExprIdentifier(pos, "d"),
                                                  Inequality.LT,
                                                  new ExprInt(pos, 0)),
                               ifInsList1));
        insList1.add(new IfCond(pos,
                               new ExprEquality(pos,
                                                new ExprIdentifier(pos, "d"),
                                                Equality.EQ,
                                                new ExprInt(pos, 0)),
                               ifInsList2));

        // Main
        List<ExprIdentifier> args2 = new ArrayList<ExprIdentifier>();
        List<Instruction> insList2 = new ArrayList<Instruction>();
        insList2.add(new Print(pos, Type.ARRAY_CHAR,
                               new ExprString(pos, "Number of solutions: ")));
        List<Expr> params = new List<Expr>();
        params.add(new ExprInt(pos, "1"));
        params.add(new ExprInt(pos, "2"));
        params.add(new ExprInt(pos, "1"));

        inslist2.add(new Print(pos, Type.INT,
                               new ExprFuncCall(pos, "num_solutions", params)));
        List<Function> funcs = new List<Function>();
        funcs.add(new Function(pos, "num_solutions", args1, insList1, returnType));
        funcs.add(new Function(pos, "main", args2, insList2, Type.NONE));
        return new Program(pos, funcs);
    }

    static Program gcd() {
        List<ExprIdentifier> args1 = new ArrayList<ExprIdentifier>();
        List<ExprIdentifier> args2 = new ArrayList<ExprIdentifier>();

        List<Instruction> ins1 = new ArrayList<Instruction>();
        List<Instruction> ins2 = new ArrayList<Instruction>();

        args1.add(new ExprIdentifier(pos, Type.INT, "a"));
        args1.add(new ExprIdentifier(pos, Type.INT, "b"));

        List <Instruction> loopIns = new List<Instruction>();
        List <Instruction> ifIns = new List<Instruction>();
        ifIns.add(new Assign(pos, new ExprIdentifier(pos, "b"),
                             new ExprBinop(pos,
                                           new ExprIdentifier(pos, "b"),
                                           Binop.SUB,
                                           new ExprIdentifier(pos, "a"))));

        List <Instruction> elseIns = new List<Instruction>();
        elseIns.add(new Assign(pos, new ExprIdentifier(pos, "a"),
                               new ExprBinop(pos,
                                             new ExprIdentifier(pos, "a"),
                                             Binop.SUB,
                                             new ExprIdentifier(pos, "b"))));

        loopIns.add(new IfCond(pos, new ExprInequality(pos,
                                                       new ExprIdentifier(pos, "a"),
                                                       Inequality.LT,
                                                       new ExprIdentifier(pos, "b")),
                               ifIns));

        loopIns.add(new elseCond(pos, elseIns));

        ins1.add(new WhileLoop(pos,
                               new ExprNegation(pos,
                                                Negation.EQ,
                                                new ExprEquality(pos,
                                                                new ExprIdentifier(pos, "a"),
                                                                Equality.EQ,
                                                                new ExprIdentifier(pos, "b"))),
                               loopIns));
        ins1.add(new Return(pos, new ExprIdentifier(pos, "a")));

        List<Expr> params = new ArrayList<Expr>();
        params.add(new ExprInt(pos, 21));
        params.add(new ExprInt(pos, 15));

        ins2.add(new Print(pos, Type.INT, ExprFuncCall(pos, "gcd", params)));

        List<Function> funcs = new List<Function>();
        funcs.add(new Function(pos, "gcd", args1, ins1, Type.INT));
        funcs.add(new Function(pos, "main", args2, ins2, Type.NONE));
        return new Program(pos, funcs);
    }

    public static void main(String[] args) throws Exception {
        Program discProg = discriminant();
        Program gcdProg = gcd();
    }
}
