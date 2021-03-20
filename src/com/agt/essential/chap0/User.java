package com.agt.essential.chap0;


public class User {
    private long id; // 8 bytes
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private byte status; // 0 deactivated, 1 active, 2 suspended, 3 closed
    private short age; // 134 Oldest
    private int trips; // 4 bytes
    private float rating; // Uber Driver/Passenger 0.00 - 5.00
    private double balance; // 8 bytes
    private boolean mock; // 1 byte
//    private char role; // 'D', ''
//    Boolean
}
