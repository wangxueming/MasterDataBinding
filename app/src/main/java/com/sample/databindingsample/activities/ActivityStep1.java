package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.UserStep1;
import com.sample.databindingsample.databinding.StepOneBinding;
import com.sample.databindingsample.R;

public class ActivityStep1 extends AppCompatActivity {
/*
* 第一步，先绑一个User信息
* 定义了layout的xml根元素，data中描述了user变量属性。在View用设置属性。
* 注意：xml中的user属性，对应的是函数名称！！！
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepOneBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step1);
        UserStep1 user = new UserStep1("Step1_FirstName", "Step1_SecondName");
        binding.setUser(user);
    }
}
