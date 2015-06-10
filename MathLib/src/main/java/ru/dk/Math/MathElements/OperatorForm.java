package ru.dk.Math.MathElements;

import ru.dk.Math.MathElement;
import ru.dk.Math.MathSettings;

public class OperatorForm extends MathElement {
    private final OperatorElement[] elements;

    public OperatorForm(OperatorElement[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString(MathSettings settings) {
        return null;
    }
}
