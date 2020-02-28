package ast;
import java.util.*;

public class IfCond extends Instruction {
    public Expr expr;
    public ArrayList<Instruction> instructions;
    public IfCond(Position pos, Expr expr, ArrayList<Instruction> instructions) {
        this.pos = pos;
        this.expr = expr;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
