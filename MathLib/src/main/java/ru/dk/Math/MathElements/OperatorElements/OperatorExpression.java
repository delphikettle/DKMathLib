package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElementType;
import ru.dk.Math.MathSettings;

public class OperatorExpression extends OperatorElement {
    private final String expressionName;
    private Expression expression = new Countable<Integer>(0);
    {
        type = OperatorElementType.Expression;
    }

    public OperatorExpression(String expressionName) {
        this.expressionName = expressionName;
    }

    @Override
    public String toString(MathSettings settings) {
        return expression.toString(settings);
    }
}
