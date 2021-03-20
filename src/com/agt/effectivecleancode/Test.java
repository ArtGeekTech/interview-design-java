package com.agt.effectivecleancode;

import com.agt.effectivecleancode.pattern.builder.ImmutableOptionalConfigurableObject;

public class Test {
    public static void main(String[] args) {
        testImmutableOptionalConfigurableObject();
    }

    public static void testImmutableOptionalConfigurableObject() {
        final String field1 = "req1";
        final int field2 = 2;
        final String field3 = "opt3";
        final int field4 = 4;

        ImmutableOptionalConfigurableObject object0
                = ImmutableOptionalConfigurableObject.newBuilder(field1, field2).build();
        ImmutableOptionalConfigurableObject object1
                = ImmutableOptionalConfigurableObject.newBuilder(field1, field2).build();
        System.out.println(object0);
        System.out.println(object1);
        System.out.println(object0 == object1);

        ImmutableOptionalConfigurableObject object3
                = ImmutableOptionalConfigurableObject
                    .newBuilder(field1, field2).setField3(field3).setField4(field4).build();
        System.out.println(object3);

        ImmutableOptionalConfigurableObject object4 = object3.toBuilder().setField2(field2 + 1).build();
        System.out.println(object3);
        System.out.println(object4);
    }
}
