package com.sample.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.databinding.DeepLayoutBinding;

public class DeepLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DeepLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.deep_layout);
        User user = new User("DEEP", "   -layout");
        user.setAdult(true);
        user.setConnectionUser(new User("u2", "-lay2"));
        binding.setUser(user);
    }
}
