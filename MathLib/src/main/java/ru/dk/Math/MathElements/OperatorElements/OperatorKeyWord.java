package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElementType;
import ru.dk.Math.MathSettings;

public class OperatorKeyWord extends OperatorElement {
    private final String keyWordName;
    {
        type = OperatorElementType.KeyWord;
    }

    public OperatorKeyWord(String keyWordName) {
        this.keyWordName = keyWordName;
    }

    @Override
    public String toString(MathSettings settings) {
        return settings.getKeyWord(keyWordName);
    }
}
