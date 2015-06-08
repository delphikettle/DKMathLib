package ru.dk.Math.MathElements.Expressions.Operators;

import ru.dk.Math.MathElements.Expressions.Operator;
import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElements.OperatorExpression;
import ru.dk.Math.MathElements.OperatorElements.OperatorSign;
import ru.dk.Math.MathElements.OperatorForm;

public abstract class BinaryOperator extends Operator {
    protected BinaryOperator(OperatorSign sign) {
        super(new OperatorForm[]{
                new OperatorForm(new OperatorElement[]{
                        new OperatorExpression(),
                        sign,
                        new OperatorExpression()
                })
        });
    }
}
