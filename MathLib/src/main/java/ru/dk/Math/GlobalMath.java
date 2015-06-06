package ru.dk.Math;

public final class GlobalMath {
    private static MathSpace currentMathSpace;

    private GlobalMath() {
    }

    public static MathSpace getCurrentMathSpace() {
        return currentMathSpace;
    }

    public static void setCurrentMathSpace(MathSpace currentMathSpace) {
        GlobalMath.currentMathSpace = currentMathSpace;
    }
}
