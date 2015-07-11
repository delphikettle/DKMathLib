package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathExceptions.IncompatibleNumberTypes;
import ru.dk.Math.MathSettings;

/**
 * The type Countable.
 *
 * @param <TYPE> the type parameter
 */
public class Countable<TYPE extends Number> extends Expression {
    /*
    TODO Countable must contain number information
    TODO Countable must have plus, minus, multiply and division methods
     */

    /**
     * The Value.
     */
    public final TYPE value;

    /**
     * Instantiates a new Countable.
     *
     * @param value the value
     */
    public Countable(TYPE value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public TYPE getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public String toString(MathSettings settings) {
        return this.toString();
    }

    @Override
    public boolean isCountable() {
        return true;
    }

    @Override
    protected <T extends Number> Countable<T> count() throws IncompatibleNumberTypes {
        try {
            return new Countable<T>((T) this.getValue());
        } catch (ClassCastException e) {
            throw new IncompatibleNumberTypes();
        }
    }

}
