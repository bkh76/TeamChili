package ast;
import java.util.*;

public class IfCond extends Conditional {
    public Expr expr;
    public List<Instruction> instructions;
    public IfCond(Position pos, Expr expr, List<Instruction> instructions) {
        this.pos = pos;
        this.expr = expr;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
