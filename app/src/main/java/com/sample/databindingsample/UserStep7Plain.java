package com.sample.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by magic on 2016/9/30.
 */

public class UserStep7Plain extends BaseObservable {
    public final ObservableField<String> firstName =
            new ObservableField<>();
    public final ObservableField<String> lastName =
            new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
