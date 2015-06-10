package ru.dk.Math;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.Expressions.Countable;

import java.util.Map;

public interface Calculator {
    Countable calculate(Map<String, Expression> arguments);
}
