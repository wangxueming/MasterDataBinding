package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep4;
import com.sample.databindingsample.databinding.StepFourBinding;

public class ActivityStep4 extends AppCompatActivity {
/*
* 第四步，通过include 嵌套
* father layout有的variable，the included layout 也需要有一份一样的
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepFourBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step4);
        UserStep4 user = new UserStep4("Step4_FirstName", "Step4_SecondName");
        user.setAdult(true);//#~~~~~~~false改成true试试效果。
        user.setInnerUser(new UserStep4("Inner_FirstName", "Inner_SecondName"));
        binding.setUser(user);
    }
}
