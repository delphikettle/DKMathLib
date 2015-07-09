package ru.dk.Math;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Math settings.
 */
public class MathSettings {
    private final Map<String, String> signs = new HashMap<String, String>();
    private final Map<String, String> keyWords = new HashMap<String, String>();

    /**
     * Gets sign.
     *
     * @param signName the sign name
     * @return the sign
     */
    public String getSign(String signName) {
        return signs.get(signName);
    }

    /**
     * Gets key word.
     *
     * @param keyWordName the key word name
     * @return the key word
     */
    public String getKeyWord(String keyWordName) {
        return keyWords.get(keyWordName);
    }
}
