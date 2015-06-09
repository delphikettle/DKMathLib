package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathElements.OperatorElementType;

public class OperatorKeyWord extends OperatorElement {
    private final String keyWordName;
    {
        type = OperatorElementType.KeyWord;
    }

    public OperatorKeyWord(String keyWordName) {
        this.keyWordName = keyWordName;
    }
}
