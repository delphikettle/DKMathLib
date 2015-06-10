package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathExceptions.ExpressionIsNotCountable;

public abstract class Expression extends MathElement {
    public abstract boolean isCountable();

    protected abstract <T extends Number> Countable<T> count();

    public <T extends Number> Countable<T> calculate() throws ExpressionIsNotCountable {
        if (this.isCountable())
            return this.count();
        else throw new ExpressionIsNotCountable();
    }
}
