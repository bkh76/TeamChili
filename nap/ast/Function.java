package ast;
import java.util.*;

public class Function extends Ast {
    Position pos;
    String funcName;
    List<ExprIdentifier> arguments;
    List<Instruction> instructions;
    Type returnType;

    public Function(Position pos,
                    String funcName,
                    List<ExprIdentifier> arguments,
                    List<Instruction> instructions,
                    Type returnType) {
        this.pos = pos;
        this.funcName = funcName;
        this.arguments = arguments;
        this.instructions = instructions;
        this.returnType = returnType;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
