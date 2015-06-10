package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.OperatorForm;
import ru.dk.Math.MathSettings;

import java.util.Map;


public abstract class Operator extends Expression {
    private final OperatorForm[] forms;
    private final Calculator calculator;
    protected Map<String, Expression> arguments;

    protected Operator(OperatorForm[] forms, Calculator calculator) {
        this.forms = forms;
        this.calculator = calculator;
    }

    @Override
    public boolean isCountable() {
        return false;
    }

    @Override
    public String toString(MathSettings settings) {
        return forms[0].toString(settings);
    }
}
