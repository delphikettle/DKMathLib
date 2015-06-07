package ru.dk.Math.MathElements.Expressions;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.OperatorElement;


public abstract class Operator extends Expression {
    private final int priority = -1;
    private OperatorElement[] elements;
}
