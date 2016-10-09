package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep8;
import com.sample.databindingsample.databinding.StepEightBinding;

public class ActivityStep8 extends AppCompatActivity {
    StepEightBinding binding;
/*
* 第八步，
* 在layout中定义一个android:id，这些id可以通过binding被访问到。同样命名也是被修改过的。
* ID会被binding类中产生public final TextView xxxxxx这样的定义。
* 注意：不能在onCreate直接设置。不生效。程序运行的时候可以看下。
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_step8);
        UserStep8 user = new UserStep8("Step8_FirstName", "Step8_SecondName");
        binding.setUser(user);
        binding.idFirstN.setText("after_set_firstN111");
    }

    public void button_click(View view) {
        binding.idFirstN.setText("after_set_firstN222");
    }
}
