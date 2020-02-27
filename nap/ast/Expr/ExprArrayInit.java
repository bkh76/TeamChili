package ast;
import java.utils.*;

public class ExprArrayInit extends Expr {
    public List<Expr> init_list;

    public ExprArrayInit(Position pos, List<Expr> init_list) {
        this.pos = pos;
        this.init_list = init_list;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
