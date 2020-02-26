package ast;

public class Write extends Instruction {
    public Expression exp;
    public Write(Position pos, Expression exp){
        this.pos = pos;
        this.exp = exp;
    }
    public <T> T accept(Visitor<T> visitor) {
	return visitor.visit(this);
    }
}
