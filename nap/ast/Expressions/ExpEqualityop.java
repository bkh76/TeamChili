package ast;

public class ExpEqualityop extends Expr {
    public Expression left;
    public Expression right;
    public Equalityop op;
    public ExpBinop(Position pos, Expression left,
		    Equalityop op, Expression right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
