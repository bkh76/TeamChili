package ast;

public class New extends Instruction {
    public String identifier_name;
    public Type type;
    public int count;
    public New(Position pos, String identifier_name,
               Type type, int count) {
        this.pos = pos;
        this.identifier_name = identifier_name;
        this.type = type;
        this.count = count;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
