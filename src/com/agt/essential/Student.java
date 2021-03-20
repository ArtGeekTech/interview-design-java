package com.agt.essential;

public class Student extends Person {
    private double score;
    private String name;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNames() {
        return name + super.getName();
    }

    public static void main(String[] args) {
        Student student= new Student();

    }
}
