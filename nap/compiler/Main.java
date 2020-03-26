package compiler;
import ast.*;
import parser.*;

import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void Main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);

        napLexer lexer = new napLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        napParser parser = new napParser(tokens);

        ParseTree tree = parser.nap();

        napVisitor<Ast> buildAST = new BuildAST();
        Program program = (Program)buildAST.visit(tree);

        //Check.check(program);
    }
}
