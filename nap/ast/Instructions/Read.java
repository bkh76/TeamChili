package ast;

public class Read extends Instruction {
    public Instruction instruction;
    public Read(Position pos, Instruction instruction){
        this.pos = pos;
        this.instruction = instruction;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}