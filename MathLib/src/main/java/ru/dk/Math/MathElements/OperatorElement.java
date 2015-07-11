package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;

/**
 * The type Operator element.
 */
public abstract class OperatorElement extends MathElement {
    /**
     * The Type.
     */
    protected OperatorElementType type;

    /**
     * The enum Operator element type.
     */
    public enum OperatorElementType {
        /**
         * The Expression.
         */
        Expression, /**
         * The KeyWord.
         */
        KeyWord, /**
         * The Sign.
         */
        Sign
    }
}
