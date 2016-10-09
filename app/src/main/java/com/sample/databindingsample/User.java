package com.sample.databindingsample;

/**
 * Created by magic on 2016/9/20.
 */

public class User {
    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    private boolean isAdulta = false;
    public void setAdult(boolean value) {
        isAdulta = value;
    }
    public boolean isAdultb() {
        return isAdulta;
    }

    public User MYonnection;
    public void setConnectionUser(User  user) {
        MYonnection = user;
    }
    public User getConnectionUser() {
        return MYonnection;
    }
}
