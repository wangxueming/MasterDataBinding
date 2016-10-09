package com.sample.databindingsample;

/**
 * Created by magic on 2016/9/20.
 */

public class UserStep8 {
    private final String firstNameA;
    private final String lastNameA;
    public UserStep8(String firstName, String lastName) {
        this.firstNameA = firstName;
        this.lastNameA = lastName;
    }
    public String getFirstNameB() {
        return this.firstNameA;
    }
    public String getLastName() {
        return this.lastNameA;
    }
}
