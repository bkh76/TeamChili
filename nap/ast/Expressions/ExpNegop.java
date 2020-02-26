public class ExpNegop extends Expr {
    public Negop op;
    public Expression right;
    public ExpNegop(Position pos
		    Negop op, Expression right) {
        this.pos = pos;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}