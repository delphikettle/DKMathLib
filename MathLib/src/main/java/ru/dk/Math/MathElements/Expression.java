package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;
import ru.dk.Math.MathElements.Expressions.Countable;

public abstract class Expression extends MathElement {
    public abstract boolean isCountable();

    public abstract <TYPE extends Number> Countable<TYPE> count();
}
