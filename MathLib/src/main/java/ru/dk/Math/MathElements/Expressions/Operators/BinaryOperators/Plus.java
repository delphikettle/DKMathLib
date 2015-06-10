package ru.dk.Math.MathElements.Expressions.Operators.BinaryOperators;

import ru.dk.Math.Calculator;
import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathElements.Expressions.Operators.BinaryOperator;
import ru.dk.Math.MathElements.OperatorElements.OperatorSign;

import java.util.Map;

public class Plus extends BinaryOperator {
    protected Plus() {
        super(new OperatorSign("+"), new Calculator() {
            public Countable calculate(Map<String, Expression> arguments) {
                return null;
            }
        });
    }

    @Override
    public boolean isCountable() {
        return false;
    }

    @Override
    protected <T extends Number> Countable<T> count() {
        return null;
    }
}
