package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElementType;

public class OperatorExpression extends OperatorElement {
    private final String expressionName;
    {
        type = OperatorElementType.Expression;
    }

    public OperatorExpression(String expressionName) {
        this.expressionName = expressionName;
    }
}
