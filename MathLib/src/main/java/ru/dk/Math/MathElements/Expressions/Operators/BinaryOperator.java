package ru.dk.Math.MathElements.Expressions.Operators;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expressions.Operator;
import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElements.OperatorExpression;
import ru.dk.Math.MathElements.OperatorElements.OperatorSign;
import ru.dk.Math.MathElements.OperatorForm;

public abstract class BinaryOperator extends Operator {
    protected BinaryOperator(OperatorSign sign, Calculator calculator) {
        super(new OperatorForm[]{
                new OperatorForm(new OperatorElement[]{
                        new OperatorExpression("arg1"),
                        sign,
                        new OperatorExpression("arg2")
                })
        }, calculator);
    }
}
