package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;


public class Variable extends Expression {
    public final String name;
    public Expression value;

    public Variable(String name, Expression value) {
        this.name = name;
        this.value = value;
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
        return new Variable(this.getName(), this.getValue());
    }

    @Override
    public boolean equals(Object obj) {
        return this.getValue().equals(((Variable) obj).getValue());
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }
}
