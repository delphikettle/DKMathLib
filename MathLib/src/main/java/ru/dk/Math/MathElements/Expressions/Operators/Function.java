package ru.dk.Math.MathElements.Expressions.Operators;

import ru.dk.Math.MathElements.Expressions.Operator;

public abstract class Function extends Operator {
    private final String name;

    protected Function(String name) {
        this.name = name;
    }
}
