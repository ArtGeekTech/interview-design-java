package com.agt;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Stack;

public class InstrumentedHashSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    Stack stack; Properties pr;
    private int addCount = 0;

    public InstrumentedHashSet() {
//        GZIPInputStream inputStream;
    }
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e); }

    @Override public boolean addAll(Collection<? extends E> c) {
//        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        System.out.println(s.getAddCount());
        s.addAll(List.of("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
