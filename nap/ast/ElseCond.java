package ast;
import java.util.*;

public class ElseCond extends Instruction {
    public ArrayList<Instruction> instructions;
    public ElseCond(Position pos, ArrayList<Instruction> instructions) {
        this.pos = pos;
        this.instructions = instructions;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
