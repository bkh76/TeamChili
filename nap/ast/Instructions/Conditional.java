package ast;

public abstract class Conditional extends Ast {
    public abstract <T> T accept(Visitor<T> visitor);
}
