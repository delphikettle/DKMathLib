package ru.dk.Math;

import ru.dk.Math.MathElements.Expression;
import ru.dk.Math.MathElements.Expressions.Countable;

import java.util.Map;

/**
 * The interface Calculator.
 */
public interface Calculator {
    /**
     * Calculate countable.
     *
     * @param arguments the arguments
     * @return the countable
     */
    Countable calculate(Map<String, Expression> arguments);
}
