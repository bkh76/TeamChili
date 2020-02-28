package ast;
import java.util.*;

public class Program extends Ast {
    public ArrayList<Function> program;
    public Program(Position pos, ArrayList<Function> program){
        this.pos = pos;
        this.program = program;
    }
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
