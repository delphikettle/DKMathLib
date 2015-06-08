package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.OperatorForm;


public abstract class Operator extends Expression {
    private final OperatorForm[] forms;

    protected Operator(OperatorForm[] forms) {
        this.forms = forms;
    }
}
