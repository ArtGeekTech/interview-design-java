package com.agt.subpkg;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

        Set<?> unbound = new HashSet<>();
        unbound.add(null);

        System.out.println(unbound);

        FilterInputStream fi;
        try (InputStream input = new FileInputStream("input.txt");
             OutputStream output = new FileOutputStream("output.txt")) {
            input.transferTo(output); // transferTo的作用是?
        }

        int a = 72;
        int b = 105;
        int c = 65281;
        String s0 = "" + (char)a + (char)b + (char)c;
        System.out.println(s0);



//        Object[] arr = new int[1];
        Object[] arr = new String[1];
        Stack stack = new Stack<String>();
        Stack<Integer> s = new Stack();
        Properties properties;
        File f = new File("./src/com/agt");
        File[] fs1 = f.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        // 仅列出.exe文件
        File[] fs2 = f.listFiles((dir, name) -> {
            return name.endsWith(".java"); // 返回true表示接受该文件
        });
        printFiles(fs2);
        Set<Integer> s1 = new HashSet<>();
        Set<Double> s2 = new HashSet<>();
        Set<? extends Number> ss = union(s1, s2);
        List<String> l1 = new ArrayList<>();
        swap1(l1, 0, 1);
        swap2(l1, 0, 1);
//        ss
    }

    static void printFiles(File[] files) {

        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }

    enum Weekday {
        MON, TUE, WED, THU, FRI, SAT, SUN;
    }

    static <E> void swap1(List<E> list, int i, int j) {}

    static void swap2(List<?> list, int i, int j) {}

    static <E extends Comparable<E>> E max1(Collection<E> c) {
        E result = null;
        for (E e : c) {
            if (e == null) {
                continue;
            }
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }
        return result;
    }

    static <E extends Comparable<? super E>> E max2(Collection<? extends E> c) {
        E result = null;
        for (E e : c) {
            if (e == null) {
                continue;
            }
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }
        return result;
    }

    static <E> Set<? extends E> union(Set<? extends E> s1, Set<? extends E> s2) {
        return null;
    }
}
