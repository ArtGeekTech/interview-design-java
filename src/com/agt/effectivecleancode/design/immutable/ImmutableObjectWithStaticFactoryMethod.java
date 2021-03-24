package com.agt.effectivecleancode.design.immutable;

import java.util.Arrays;

public class ImmutableObjectWithStaticFactoryMethod {
    private final int field1;
    private final String field2;
    private final String[] field3;

    // Effective final class for clients outside of the package
    ImmutableObjectWithStaticFactoryMethod(int field1, String field2, String[] field3) {
        this.field1 = field1;
        this.field2 = field2;
        // make defensive copy when necessary
        this.field3 = field3 == null ? null : Arrays.copyOf(field3, field3.length);
    }

    // static factory method to allow package-private implementation flexibility and object-caching
    public static ImmutableObjectWithStaticFactoryMethod valueOf(int field1, String field2, String[] field3) {
        return new ImmutableObjectImpl(field1, field2, field3);
    }

    // make defensive copy when necessary
    public String[] getField3() {
        return field3 == null ? null : Arrays.copyOf(field3, field3.length);
    }

    @Override
    public String toString() {
        return "ImmutableObjectWithStaticFactoryMethod{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3=" + Arrays.toString(field3) +
                '}';
    }
}
