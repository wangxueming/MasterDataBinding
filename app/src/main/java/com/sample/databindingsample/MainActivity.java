package com.sample.databindingsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutManager;

import com.sample.databindingsample.databinding.MainViewBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainViewBinding binding = DataBindingUtil.setContentView(this, R.layout.datbind);
        User user = new User("Test1", "User");
        binding.setUser(user);

        binding.bindingList.setHasFixedSize(true);
        binding.bindingList.setLayoutManager(new LinearLayoutManager(this));
       // binding.bindingList.setAdapter(new UserAdapter());
    }
}
