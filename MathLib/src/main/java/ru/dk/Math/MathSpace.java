package ru.dk.Math;

import ru.dk.Math.MathElements.Expressions.Variable;

import java.util.HashMap;
import java.util.Map;

public class MathSpace {
    private final Map<String, Variable> variables = new HashMap<String, Variable>();

    public void addVariable(Variable variable) throws SameVariableException {
        if (variables.containsKey(variable.getName()) || variables.containsValue(variable))
            throw new SameVariableException();
        variables.put(variable.getName(), variable);
    }

    public Variable getVariable(String name) throws UnknownVariableException {
        if (!variables.containsKey(name))
            throw new UnknownVariableException();
        return variables.get(name);
    }

    public class SameVariableException extends Throwable {

    }

    public class UnknownVariableException extends Throwable {

    }
}
