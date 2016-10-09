package com.sample.databindingsample;

/**
 * Created by magic on 2016/9/20.
 */

public class UserStep4 {
    private final String firstNameA;
    private final String lastNameA;
    public UserStep4(String firstName, String lastName) {
        this.firstNameA = firstName;
        this.lastNameA = lastName;
    }
    public String getFirstNameB() {
        return this.firstNameA;
    }
    public String getLastName() {
        return this.lastNameA;
    }

    private boolean isAdultB = false;
    public void setAdult(boolean value) {
        isAdultB = value;
    }
    public boolean isAdult() {
        return isAdultB;
    }


    public UserStep4 mInnerUser;
    public void setInnerUser(UserStep4 user) {
        mInnerUser = user;
    }
    public UserStep4 getInnerUser() {
        return mInnerUser;
    }
}
