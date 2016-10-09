package com.sample.databindingsample;

import android.databinding.BaseObservable;
import com.sample.databindingsample.BR;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by magic on 2016/9/20.
 */

public class UserStep7 extends BaseObservable {
    public final ObservableField<String> firstNameOB = new ObservableField<>();
    public final ObservableField<String> lastNameOB = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
    private String firstNameA;
    private String lastNameA;
    public UserStep7(String firstName, String lastName) {
        this.firstNameA = firstName;
        this.lastNameA = lastName;
    }
    @Bindable
    public String getFirstNameB() {
        return this.firstNameA;
    }
    public void setFirstNameB(String name) {
        this.firstNameA = name;
        notifyPropertyChanged(BR.firstNameB);
    }
    @Bindable
    public String getLastName() {
        return this.lastNameA;
    }
    public void setLastName(String name) {
        this.lastNameA = name;
        notifyPropertyChanged(BR.lastName);
    }
}
