package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;
import ru.dk.Math.MathElements.Expressions.Countable;
import ru.dk.Math.MathExceptions.ExpressionIsNotCountable;
import ru.dk.Math.MathExceptions.IncompatibleNumberTypes;

/**
 * The type Expression.
 */
public abstract class Expression extends MathElement {
    /**
     * Is countable.
     *
     * @return the boolean
     */
    public abstract boolean isCountable();

    /**
     * Count countable.
     *
     * @param <T> the type parameter
     * @return the countable
     */
    protected abstract <T extends Number> Countable<T> count() throws IncompatibleNumberTypes;

    /**
     * Calculate countable.
     *
     * @param <T> the type parameter
     * @return the countable
     * @throws ExpressionIsNotCountable the expression is not countable
     */
    public <T extends Number> Countable<T> calculate() throws ExpressionIsNotCountable, IncompatibleNumberTypes {
        if (this.isCountable())
            return this.count();
        else throw new ExpressionIsNotCountable();
    }
}
