package com.agt.essential;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;

public class Pair<T, K> implements Iterable<Pair>{
    Class cls = Pair.class;
    private T first;
    private K last;
    Class<? super String> sup = String.class.getSuperclass();
    List list = new ArrayList();

    T[] createArray(Class<T> cls) {
        Map<String, Integer> map = new HashMap<>();
        map.keySet();
        HashSet set;
        list.toArray();
        return (T[]) Array.newInstance(cls, 5);
    }

    public Pair(T first, K last) {
        Object[] objectArray = new String[10];
        Number[] objectArray2 = new Integer[10];
        Pair<String, Integer>[] ps =  new Pair[2];

        this.first = first;
        this.last = last;
    }

    public static <K, T> Pair<K, T> valueOf(K first, T last) {
        return new Pair<>(first, last);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getLast() {
        return last;
    }

    public void setLast(K last) {
        this.last = last;
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(2, "a");
        System.out.println(p1.getLast());

        Pair p2 = new Pair(9, p1);
        System.out.println(p2.getLast());

        System.out.println(Pair.valueOf(1, "c").getLast());
        System.out.println(Pair.valueOf(1, p1).getLast());
        System.out.println(Pair[].class);
//        System.out.println(Pair<Integer, String>.valueOf(1, "d").getLast());
    }

    @Override
    public Iterator<Pair> iterator() {
        return null;
    }
}
