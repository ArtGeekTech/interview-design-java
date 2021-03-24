package com.agt.effectivecleancode.design.immutable;

import java.util.Arrays;
import java.util.List;

// Prevent malicious subclass to compromise immutable behavior
public final class ImmutableFinalObjectWithDefensiveCopy {
    private final int field1;
    private final String field2;
    private final String[] field3;

    public ImmutableFinalObjectWithDefensiveCopy(int field1, String field2, String[] field3) {
        this.field1 = field1;
        this.field2 = field2;
        // make defensive copy when necessary
        this.field3 = field3 == null ? null : Arrays.copyOf(field3, field3.length);
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    // make defensive copy when necessary
    public String[] getField3() {
        return field3 == null ? null : Arrays.copyOf(field3, field3.length);
    }

    // array can be replaced by immutable list view
    public List<String> getImmutableViewOfField3() {
        return List.of(field3);
    }

    @Override
    public String toString() {
        return "ImmutableFinalObjectWithDefensiveCopy{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3=" + Arrays.toString(field3) +
                '}';
    }
}
