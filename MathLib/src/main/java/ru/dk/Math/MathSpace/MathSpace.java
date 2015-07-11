package ru.dk.Math.MathSpace;

import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathExceptions.VariableExceptions.SameVariableException;
import ru.dk.Math.MathExceptions.VariableExceptions.UnknownVariableException;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Math space.
 */
public class MathSpace {
    private final Map<String, Variable> variables = new HashMap<String, Variable>();

    /**
     * Adds the variable given as argument
     *
     * @param variable variable that must be added
     * @throws SameVariableException the same variable exception
     */
    public Variable addVariable(Variable variable) throws SameVariableException {
        if (variables.containsKey(variable.getName()) || variables.containsValue(variable))
            throw new SameVariableException(variable);
        variables.put(variable.getName(), variable);
        return variable;
    }

    /**
     * Finds and returns the variable with the given name
     * @param name name of the variable that must be given
     * @return the variable with the given name
     * @throws UnknownVariableException the unknown variable exception
     */
    public Variable getVariable(String name) throws UnknownVariableException {
        if (!variables.containsKey(name))
            throw new UnknownVariableException(name);
        return variables.get(name);
    }

}
