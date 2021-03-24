package com.agt.effectivecleancode.design.onlystatic;

// Grouping of util members, not meant to be instanced
public class OnlyStaticMethodUtility {
    private static int CONSTANT_VALUE = 2;

    // Suppress default constructor provided by compiler,
    // also prevent malicious subclassing
    private OnlyStaticMethodUtility() {
        throw new AssertionError();
    }

    public static int doubleNum(int num) {
        return num * CONSTANT_VALUE;
    }
}
