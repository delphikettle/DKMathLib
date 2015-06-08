package ru.dk.Math.MathExceptions;

import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathException;

public class VariableException extends MathException {
    private final Variable variable;

    public VariableException(Variable variable) {
        this.variable = variable;
    }
}
