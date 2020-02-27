package ast;

public class Function extends Ast {
    Position pos;
    List<Argument> arguments;
    List<Instruction> instructions;
    Type return_type;

    public Function(Position pos,
                    List<Argument> arguments,
                    List<Instruction> instructions,
                    Type return_type) {
        this.pos = pos;
        this.arguments = arguments;
        this.instructions = instructions;
        this.return_type = return_type;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
