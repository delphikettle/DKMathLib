package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElementType;
import ru.dk.Math.MathSettings;

public class OperatorSign extends OperatorElement {
    private final String signName;
    {
        type = OperatorElementType.Sign;
    }

    public OperatorSign(String signName) {
        this.signName = signName;
    }

    @Override
    public String toString(MathSettings settings) {
        return settings.getSign(signName);
    }
}
