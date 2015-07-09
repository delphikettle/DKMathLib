package ru.dk.Math.MathExceptions;

import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathException;

/**
 * The type Variable exception.
 */
public class VariableException extends MathException {
    private final Variable variable;

    /**
     * Instantiates a new Variable exception.
     *
     * @param variable the variable
     */
    public VariableException(Variable variable) {
        this.variable = variable;
    }
}
