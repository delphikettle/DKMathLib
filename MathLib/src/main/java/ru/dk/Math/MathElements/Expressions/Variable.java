package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathExceptions.ExpressionIsNotCountable;
import ru.dk.Math.MathSettings;


public class Variable extends Expression {
    public final String name;
    public Expression value;

    public Variable(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    public Variable(char name, Expression value) {
        this("" + name, value);
    }

    public String getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Variable(this.getName() + "_c", this.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getValue().equals(((Variable) obj).getValue());
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
    protected <T extends Number> Countable<T> count() {
        try {
            return value.calculate();
        } catch (ExpressionIsNotCountable expressionIsNotCountable) {
            System.out.println("Так быть не должно!");
            throw new RuntimeException();
        }
    }
}
