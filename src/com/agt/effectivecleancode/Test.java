package com.agt.effectivecleancode;

import com.agt.effectivecleancode.design.immutable.CrappyImmutableObject;
import com.agt.effectivecleancode.design.immutable.HackCrappyImmutableObject;
import com.agt.effectivecleancode.design.immutable.ImmutableFinalObjectWithDefensiveCopy;
import com.agt.effectivecleancode.design.immutable.ImmutableObjectWithStaticFactoryMethod;
import com.agt.effectivecleancode.design.onlystatic.OnlyStaticMethodUtility;
import com.agt.effectivecleancode.pattern.builder.ImmutableOptionalConfigurableObject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        testPatternBuilder();
//        testDesignImmutable();
//        testDesignOnlyStatic();
    }

    public static void demoJdkStaticFactoryMethod() {

    }

    public static void testDesignOnlyStatic() {
        // Forbid creating new instance
//        OnlyStaticMethodUtility utility = new OnlyStaticMethodUtility();
        System.out.println(OnlyStaticMethodUtility.doubleNum(16));
    }

    public static void testDesignImmutable() {
        // Crappy & Hack way
        String[] clientInput = {"version1"};
        CrappyImmutableObject obj1 = new CrappyImmutableObject(1, "a", clientInput);
        System.out.println(obj1);
        clientInput[0] = "version2";
        System.out.println(obj1);

        CrappyImmutableObject obj2 = new HackCrappyImmutableObject(1, "a", null);
        System.out.println(obj2.getField1());
        ((HackCrappyImmutableObject)obj2).setHackField1(111);
        System.out.println(obj2.getField1());

        // Final & Defensive Copy way
        ImmutableFinalObjectWithDefensiveCopy obj3 = new ImmutableFinalObjectWithDefensiveCopy(1, "a", clientInput);
        System.out.println(obj3);
        clientInput[0] = "version3";
        System.out.println(obj3);
        obj3.getField3()[0] = "version3";
        System.out.println(obj3);

        // Static Factory way
        ImmutableObjectWithStaticFactoryMethod obj4 = ImmutableObjectWithStaticFactoryMethod.valueOf(1, "a", clientInput);
        System.out.println(obj4);
        clientInput[0] = "version4";
        obj4.getField3()[0] = "version4";
        System.out.println(obj4);
    }

    public static void testPatternBuilder() {
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
        System.out.println(object0 == object1); // different instances

        ImmutableOptionalConfigurableObject object3
                = ImmutableOptionalConfigurableObject
                    .newBuilder(field1, field2).setField3(field3).setField4(field4).build();
        System.out.println(object3);

        ImmutableOptionalConfigurableObject object4 = object3.toBuilder().setField2(field2 + 1).build();
        System.out.println(object3); // original instance is intact
        System.out.println(object4);
    }
}
