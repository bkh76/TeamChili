package ast;

public class ExprArray extends Expr {
    public Type type;
    public List<Expr> elements;
    public int length;

    public ExprArray(Position pos, Type type,
                     List<Expr> elements, int length) {
        this.pos = pos;
        this.type = type;
        this.elements = elements;
        this.length = length;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
