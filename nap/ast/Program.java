package ast;
import java.util.*;

public class Program extends Ast {
    public List<Instruction> program;
    public Program(Position pos, List<Instruction> program){
        this.pos = pos;
        this.program = program;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }    
}
