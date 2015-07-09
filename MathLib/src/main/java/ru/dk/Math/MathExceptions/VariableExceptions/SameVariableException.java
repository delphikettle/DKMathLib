package ru.dk.Math.MathExceptions.VariableExceptions;


import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathExceptions.VariableException;

/**
 * The type Same variable exception.
 */
public class SameVariableException extends VariableException {

    /**
     * Instantiates a new Same variable exception.
     *
     * @param variable the variable
     */
    public SameVariableException(Variable variable) {
        super(variable);
    }
}