package ru.dk.Math.MathElements.OperatorElements;

import ru.dk.Math.MathElements.OperatorElement;
import ru.dk.Math.MathSettings;

/**
 * The type Operator key word.
 */
public class OperatorKeyWord extends OperatorElement {
    private final String keyWordName;
    {
        type = OperatorElementType.KeyWord;
    }

    /**
     * Instantiates a new Operator key word.
     *
     * @param keyWordName the key word name
     */
    public OperatorKeyWord(String keyWordName) {
        this.keyWordName = keyWordName;
    }

    @Override
    public String toString(MathSettings settings) {
        return settings.getKeyWord(keyWordName);
    }
}
