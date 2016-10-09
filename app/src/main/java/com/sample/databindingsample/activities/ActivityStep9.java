package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep9;
import com.sample.databindingsample.databinding.ActivityStep9Binding;
import com.sample.databindingsample.databinding.ViewStubBinding;

public class ActivityStep9 extends AppCompatActivity {
    ActivityStep9Binding mbinding;
/*
 * 第九步，在layout中嵌套一个ViewStub
 * 定义ViewStub嵌套的layout。
 * 注意：在binding.setUser的时候会出现红色的error。无视它。可以编过去的！！！
 * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mbinding = DataBindingUtil.setContentView(this, R.layout.activity_step9);
        mbinding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewStubBinding binding = DataBindingUtil.bind(inflated);
                UserStep9 user = new UserStep9("step9_first", "step9_second");
                binding.setUser(user);
            }
        });
    }

    public void inflateViewStub(View view) {
        if (!mbinding.viewStub.isInflated()) {
            mbinding.viewStub.getViewStub().inflate();
        }
    }
}
