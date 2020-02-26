package ast;

public abstract class Instruction extends Ast {
    public abstract <T> T accept(Visitor<T> visitor);
}
