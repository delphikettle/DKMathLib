package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathExceptions.ExpressionIsNotCountable;
import ru.dk.Math.MathExceptions.IncompatibleNumberTypes;
import ru.dk.Math.MathSettings;


/**
 * The type Variable.
 */
public class Variable extends Expression {
    /**
     * The Name.
     */
    public final String name;
    /**
     * The Value.
     */
    public Expression value;

    /**
     * Instantiates a new Variable.
     *
     * @param name  the name
     * @param value the value
     */
    public Variable(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Instantiates a new Variable.
     *
     * @param name  the name
     * @param value the value
     */
    public Variable(char name, Expression value) {
        this("" + name, value);
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public Expression getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }

    @Override
    public String toString(MathSettings settings) {
        return value.toString(settings);
    }

    @Override
    public boolean isCountable() {
        return value.isCountable();
    }

    @Override
    protected <T extends Number> Countable<T> count() throws IncompatibleNumberTypes {
        try {
            return value.calculate();
        } catch (ExpressionIsNotCountable expressionIsNotCountable) {
            System.out.println("Так быть не должно!");
            throw new RuntimeException();
        }
    }
}
