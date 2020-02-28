package ast;

public class ExprEquality extends Expr {
    public Expr left;
    public Expr right;
    public Equality op;
    public ExprEquality(Position pos, Expr left,
		                Equality op, Expr right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
