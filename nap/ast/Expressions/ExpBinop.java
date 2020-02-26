package ast;

public class ExpBinop extends Expr {
    public Expression left;
    public Expression right;
    public Arithmeticop op;
    public ExpBinop(Position pos, Expression left,
		    Arithmeticop op, Expression right) {
        this.pos = pos;
        this.left = left;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}