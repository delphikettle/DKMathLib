package ru.dk.Math.MathElements.Expressions.Operators;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expressions.Operator;
import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElements.OperatorKeyWord;
import ru.dk.Math.MathElements.OperatorElements.OperatorSign;
import ru.dk.Math.MathElements.OperatorForm;

public abstract class Function extends Operator {
    protected Function(OperatorKeyWord name, Calculator calculator) {
        super(new OperatorForm[]{
                new OperatorForm(new OperatorElement[]{
                        name,
                        new OperatorSign("("),
                        new OperatorSign(")"),
                })
        }, calculator);
    }
}
