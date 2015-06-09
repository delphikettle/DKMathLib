package ru.dk.Math;

import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathExceptions.VariableExceptions.SameVariableException;
import ru.dk.Math.MathExceptions.VariableExceptions.UnknownVariableException;

import java.util.HashMap;
import java.util.Map;

public class MathSpace {
    private final Map<String, Variable> variables = new HashMap<String, Variable>();

    /**
     * Adds the variable given as argument
     *
     * @param variable variable that must be added
     * @throws SameVariableException
     */
    public void addVariable(Variable variable) throws SameVariableException {
        if (variables.containsKey(variable.getName()) || variables.containsValue(variable))
            throw new SameVariableException(variable);
        variables.put(variable.getName(), variable);
    }

    /**
     * Finds and returns the variable with the given name
     * @param name name of the variable that must be given
     * @return the variable with the given name
     * @throws UnknownVariableException
     */
    public Variable getVariable(String name) throws UnknownVariableException {
        if (!variables.containsKey(name))
            throw new UnknownVariableException(name);
        return variables.get(name);
    }

}
