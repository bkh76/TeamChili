package ast; 
public class ExprNegation extends Expr {
    public Negation op;
    public Expr right;
    public ExprNegation(Position pos, Negation op, Expr right) {
        this.pos = pos;
        this.op = op;
        this.right = right;
    }
    
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}