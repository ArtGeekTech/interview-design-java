package com.agt;

import java.math.BigInteger;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        test49();
    }

    private static void test25() {
        System.out.println(Foo.name + com.agt.subpkg.Bar.name);
    }

    private static void test49() {
        BigInteger bigInteger = new BigInteger("13");
        bigInteger.mod(bigInteger);
        String msg = Objects.requireNonNull("hello");
        System.out.println(msg);
        msg = null;
        msg = Objects.requireNonNull(msg, "msg");
        System.out.println(msg);
    }

    private static void test(String s) {
        for (int i = 0; i < 10; i++) {
            String s1 = new String("abc");
            String s2 = "abc";
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
            System.out.println(s == s1);
            System.out.println(s == s2);
        }
    }


}
