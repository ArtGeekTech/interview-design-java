package com.agt.effectivecleancode.design.immutable;

import java.util.Arrays;

public class CrappyImmutableObject {

    private final int field1;
    private final String field2;
    private final String[] field3;

    public CrappyImmutableObject(int field1, String field2, String[] field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String[] getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "CrappyImmutableObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3=" + Arrays.toString(field3) +
                '}';
    }
}
