package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathSettings;

public class Countable<TYPE extends Number> extends Expression {
    public final TYPE value;

    public Countable(TYPE value) {
        this.value = value;
    }

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
    protected <T extends Number> Countable<T> count() {
        return new Countable<T>((T) this.getValue());
    }

}
