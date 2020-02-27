package ast;

public class Print extends Instruction {
    public Instruction instruction;
    public Print(Position pos, Instruction instruction) {
        this.pos = pos;
        this.instruction = instruction;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
