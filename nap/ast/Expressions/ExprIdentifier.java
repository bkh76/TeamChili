package ast;

public class ExprIdentifier extends Expr {
    public Type type;
    public String name;

    public ExprIdentifier(Position pos, Type type, String name) {
        this.pos = pos;
        this.type = type;
        this.name = name;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
