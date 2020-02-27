package ast;
import java.util.*;

public class ElseCond extends Conditional {
    public Expr expr;
    public List<Instruction> instructions;
    public ElseCond(Position pos, Expr expr, List<Instruction> instructions) {
        this.pos = pos;
        this.expr = expr;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
