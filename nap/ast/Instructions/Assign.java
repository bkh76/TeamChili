package ast;

public class Assign extends Instruction {
    public String identifier_name;
    public Expr expr;
    public Assign(Position pos, String identifier_name, Expr expr) {
        this.pos = pos;
        this.identifier_name = identifier_name;
        this.expr = expr;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
