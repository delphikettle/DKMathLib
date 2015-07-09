package ru.dk.Math.MathGlobal;

import ru.dk.Math.MathSpace.MathSpace;

/**
 * The type Global math.
 */
public final class GlobalMath {
    private static MathSpace currentMathSpace;

    private GlobalMath() {
    }

    /**
     * Gets current math space.
     *
     * @return the current math space
     */
    public static MathSpace getCurrentMathSpace() {
        return currentMathSpace;
    }

    /**
     * Sets current math space.
     *
     * @param currentMathSpace the current math space
     */
    public static void setCurrentMathSpace(MathSpace currentMathSpace) {
        GlobalMath.currentMathSpace = currentMathSpace;
    }
}
