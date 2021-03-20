package com.agt.sfg;

public final class MyImmutableUser {

    private final String name;
    private final Integer age;
    private final Double score;
    private final Boolean admin;

    public MyImmutableUser(String name, Integer age, Double score, Boolean admin) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getScore() {
        return score;
    }

    public Boolean getAdmin() {
        return admin;
    }
}
