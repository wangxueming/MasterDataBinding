package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep3;
import com.sample.databindingsample.databinding.StepThreeBinding;

public class ActivityStep3 extends AppCompatActivity {
/*
* 第三步，import个类进来，并调用其静态变量。运用一些基本的运算。
* 用到了什么类就一定要import进来。
* 对每一个variable，都有自动生成setter, getter.而其他的掉哟个，需要用全名
* 注意：xml中user的函数，大小写区分，并对应的是函数名。遇到重名的类，用alias可以重命名下。
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepThreeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step3);
        UserStep3 user = new UserStep3("Step3_FirstName", "Step3_SecondName");
        user.setAdult(false);//#~~~~~~~false改成true试试效果。
        user.setInnerUser(new UserStep3("Inner_FirstName", "Inner_SecondName"));
        binding.setUser(user);
    }
}
