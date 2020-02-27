package ast;
import java.lang.reflect.Array;

public class ExprArray<T> extends Expr {
    public T[] array;
    public int length;

    public ExprArray(Position pos, Class<T[]> c, int length) {
        this.pos = pos;
        this.array = c.cast(Array.newInstance(c.getComponentType(), length));
        this.legnth = length;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
