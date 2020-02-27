package ast;

public class ExprLogical extends Expr {
    public Expr left;
    public Expr right;
    public Logical op;

    public ExprLogical(Position pos, Expr left,
		               Logical op, Expr right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
