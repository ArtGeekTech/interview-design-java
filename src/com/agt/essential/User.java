package com.agt.essential;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class User implements Iterable {

    private long id;
    private String name;
    private String email;
    private String password;
    private int age;

    public String getName() {
        List<Integer> list = new LinkedList<>();

        list.iterator();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
