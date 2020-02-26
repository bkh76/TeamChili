package ast;

public class Print extends Instruction {
    public Expression exp;
    public Print(Position pos, Expression exp){
        this.pos = pos;
        this.exp = exp;
    }
    public <T> T accept(Visitor<T> visitor) {
	return visitor.visit(this);
    }
}
