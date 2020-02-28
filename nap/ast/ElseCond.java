package ast;
import java.util.*;

public class ElseCond extends Conditional {
    public List<Instruction> instructions;
    public ElseCond(Position pos, List<Instruction> instructions) {
        this.pos = pos;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
