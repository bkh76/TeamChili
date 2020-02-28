package ast;
import java.util.*;

public class ElseIfCond extends Instruction {
    public Expr expr;
    public ArrayList<Instruction> instructions;
    public ElseIfCond(Position pos, Expr expr, ArrayList<Instruction> instructions) {
        this.pos = pos;
        this.expr = expr;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
