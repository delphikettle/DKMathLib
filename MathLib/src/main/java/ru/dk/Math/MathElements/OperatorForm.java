package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;
import ru.dk.Math.MathSettings;

/**
 * The type Operator form.
 */
public class OperatorForm extends MathElement {
    private final OperatorElement[] elements;

    /**
     * Instantiates a new Operator form.
     *
     * @param elements the elements
     */
    public OperatorForm(OperatorElement[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString(MathSettings settings) {
        return null;
    }
}
