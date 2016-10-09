package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep5;
import com.sample.databindingsample.databinding.StepFiveBinding;

public class ActivityStep5 extends AppCompatActivity {
/*
* 第一步，先绑一个User信息
* 定义了layout的xml根元素，data中描述了user变量属性。在View用设置属性。
* 注意：xml中的user属性，对应的是函数名称！！！
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepFiveBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step5);
        UserStep5 user = new UserStep5("Step5_FirstName", "Step5_SecondName");
        binding.setUser(user);
    }
}
