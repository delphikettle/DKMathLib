package ru.dk.Math;

import java.util.HashMap;
import java.util.Map;

public class MathSettings {
    private final Map<String, String> signs = new HashMap<String, String>();
    private final Map<String, String> keyWords = new HashMap<String, String>();

    public String getSign(String signName) {
        return signs.get(signName);
    }

    public String getKeyWord(String keyWordName) {
        return keyWords.get(keyWordName);
    }
}
