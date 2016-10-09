package com.sample.databindingsample;

/**
 * Created by magic on 2016/9/20.
 */

public class UserStep3 {
    private final String firstNameA;
    private final String lastNameA;
    public UserStep3(String firstName, String lastName) {
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


    public UserStep3 mInnerUser;
    public void setInnerUser(UserStep3 user) {
        mInnerUser = user;
    }
    public UserStep3 getInnerUser() {
        return mInnerUser;
    }
}
