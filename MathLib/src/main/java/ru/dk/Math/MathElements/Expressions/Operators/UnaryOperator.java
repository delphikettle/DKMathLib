package ru.dk.Math.MathElements.Expressions.Operators;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expressions.Operator;
import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElements.OperatorExpression;
import ru.dk.Math.MathElements.OperatorElements.OperatorSign;
import ru.dk.Math.MathElements.OperatorForm;

/**
 * The type Unary operator.
 */
public abstract class UnaryOperator extends Operator {
    /**
     * Instantiates a new Unary operator.
     *
     * @param sign       the sign
     * @param calculator the calculator
     */
    protected UnaryOperator(OperatorSign sign, Calculator calculator) {
        super(new OperatorForm[]{
                new OperatorForm(new OperatorElement[]{
                        sign,
                        new OperatorExpression("arg")
                })
        }, calculator);
    }
}
