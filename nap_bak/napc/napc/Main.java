package picoc;

import ast.*;
import java.util.*;


public class Main {

    public static final Position pos = new Position(0, 0);

    static Program discriminant() {
        // num_solutions
        ArrayList<ExprIdentifier> args1 = new ArrayList<ExprIdentifier>();
        args1.add(new ExprIdentifier(pos, Type.INT, "a"));
        args1.add(new ExprIdentifier(pos, Type.INT, "b"));
        args1.add(new ExprIdentifier(pos, Type.INT, "c"));

        Type returnType = Type.INT;

        ArrayList<Instruction> insList1 = new ArrayList<Instruction>();
        insList1.add(new Assign(pos, "d",
        new ExprBinop(pos,
                    new ExprBinop(pos, new ExprIdentifier(pos, Type.INT, "b"),
                                 Binop.MUL, new ExprIdentifier(pos, Type.INT, "b")),
                    Binop.SUB,
                    new ExprBinop(pos,
                                 new ExprBinop(pos, new ExprInt(pos, 4),
                                              Binop.MUL,
                                              new ExprIdentifier(pos,Type.INT, "a")),
                                 Binop.MUL,
                                 new ExprIdentifier(pos, Type.INT, "c")))));

        ArrayList<Instruction> ifInsList1 = new ArrayList<Instruction>();
        ifInsList1.add(new Return(pos, new ExprInt(pos, 0)));
        ArrayList<Instruction> ifInsList2 = new ArrayList<Instruction>();
        ifInsList2.add(new Return(pos, new ExprInt(pos, 1)));

        insList1.add(new IfCond(pos,
                               new ExprInequality(pos,
                                                  new ExprIdentifier(pos, Type.INT, "d"),
                                                  Inequality.LT,
                                                  new ExprInt(pos, 0)),
                               ifInsList1));
        insList1.add(new IfCond(pos,
                               new ExprEquality(pos,
                                                new ExprIdentifier(pos, Type.INT, "d"),
                                                Equality.EQ,
                                                new ExprInt(pos, 0)),
                               ifInsList2));

        // Main
        ArrayList<ExprIdentifier> args2 = new ArrayList<ExprIdentifier>();
        ArrayList<Instruction> insList2 = new ArrayList<Instruction>();
        insList2.add(new Print(pos, Type.ARRAY_CHAR,
                               new ExprString(pos, "Number of solutions: ")));
        ArrayList<Expr> params = new ArrayList<Expr>();
        params.add(new ExprInt(pos, 1));
        params.add(new ExprInt(pos, 2));
        params.add(new ExprInt(pos, 1));

        insList2.add(new Print(pos, Type.INT,
                               new ExprFuncCall(pos, "num_solutions", params)));
        ArrayList<Function> funcs = new ArrayList<Function>();
        funcs.add(new Function(pos, "num_solutions", args1, insList1, returnType));
        funcs.add(new Function(pos, "main", args2, insList2, Type.NONE));
        return new Program(pos, funcs);
    }

    static Program gcd() {
        ArrayList<ExprIdentifier> args1 = new ArrayList<ExprIdentifier>();
        ArrayList<ExprIdentifier> args2 = new ArrayList<ExprIdentifier>();

        ArrayList<Instruction> ins1 = new ArrayList<Instruction>();
        ArrayList<Instruction> ins2 = new ArrayList<Instruction>();

        args1.add(new ExprIdentifier(pos, Type.INT, "a"));
        args1.add(new ExprIdentifier(pos, Type.INT, "b"));

        ArrayList <Instruction> loopIns = new ArrayList<Instruction>();
        ArrayList <Instruction> ifIns = new ArrayList<Instruction>();
        ifIns.add(new Assign(pos, "b",
                             new ExprBinop(pos,
                                           new ExprIdentifier(pos, Type.INT, "b"),
                                           Binop.SUB,
                                           new ExprIdentifier(pos, Type.INT, "a"))));

        ArrayList <Instruction> elseIns = new ArrayList<Instruction>();
        elseIns.add(new Assign(pos, "a",
                               new ExprBinop(pos,
                                             new ExprIdentifier(pos, Type.INT, "a"),
                                             Binop.SUB,
                                             new ExprIdentifier(pos, Type.INT, "b"))));

        loopIns.add(new IfCond(pos, new ExprInequality(pos,
                                                       new ExprIdentifier(pos, Type.INT, "a"),
                                                       Inequality.LT,
                                                       new ExprIdentifier(pos, Type.INT, "b")),
                               ifIns));

        loopIns.add(new ElseCond(pos, elseIns));

        ins1.add(new WhileLoop(pos,
                               new ExprNegation(pos,
                                                Negation.LNEG,
                                                new ExprEquality(pos,
                                                                new ExprIdentifier(pos, Type.INT, "a"),
                                                                Equality.EQ,
                                                                new ExprIdentifier(pos, Type.INT, "b"))),
                               loopIns));
        ins1.add(new Return(pos, new ExprIdentifier(pos, Type.INT, "a")));

        ArrayList<Expr> params = new ArrayList<Expr>();
        params.add(new ExprInt(pos, 21));
        params.add(new ExprInt(pos, 15));

        ins2.add(new Print(pos, Type.INT, new ExprFuncCall(pos, "gcd", params)));

        ArrayList<Function> funcs = new ArrayList<Function>();
        funcs.add(new Function(pos, "gcd", args1, ins1, Type.INT));
        funcs.add(new Function(pos, "main", args2, ins2, Type.NONE));
        return new Program(pos, funcs);
    }

    public static void main(String[] args) throws Exception {
        Program discProg = discriminant();
        Program gcdProg = gcd();
    }
}
