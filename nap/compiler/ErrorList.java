package compiler;

import java.util.LinkedList;
import java.util.List;

public class ErrorList
{
    protected List<String> errors;

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public void printErrors(){
        for (String error : errors)
            System.out.println(error);
    }

    public ErrorList() {
        errors = new LinkedList<>();
    }
}
