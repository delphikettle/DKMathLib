package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.OperatorForm;
import ru.dk.Math.MathSettings;

import java.util.Map;


/**
 * The type Operator.
 */
public abstract class Operator extends Expression {
    private final OperatorForm[] forms;
    private final Calculator calculator;
    /**
     * The Arguments.
     */
    protected Map<String, Expression> arguments;

    /**
     * Instantiates a new Operator.
     *
     * @param forms      the forms
     * @param calculator the calculator
     */
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
