package ru.dk.Math.MathExceptions.VariableExceptions;


import ru.dk.Math.MathElements.Expressions.Variable;
import ru.dk.Math.MathExceptions.VariableException;

public class SameVariableException extends VariableException {

    public SameVariableException(Variable variable) {
        super(variable);
    }
}