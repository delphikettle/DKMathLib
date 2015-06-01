package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;


public class Variable extends Expression {
    public final String name;
    public Expression value;

    public Variable(String name, Expression value) {
        this.name = name;
        this.value = value;
    }
}
