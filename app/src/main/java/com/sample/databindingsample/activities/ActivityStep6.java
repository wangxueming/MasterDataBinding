package com.sample.databindingsample.activities;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep6;
import com.sample.databindingsample.databinding.StepSixBinding;

public class ActivityStep6 extends AppCompatActivity {
/*
* 第六步，layout不支持 < 符号。所以要用&lt;来代替。这是因为什么，你懂的。
* 属性用冒号括起来就变成了字符串，需要注意的是里头用了双引号，外头要变成单引号。
* 注意：xml中的user属性，对应的是函数名称！！！
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, "one");
        sparseArray.put(2, "two");
        sparseArray.put(3, "three");
        sparseArray.put(4, "four");
        sparseArray.put(5, "five");

        HashMap map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        List<String> list = new java.util.ArrayList<String>();
        list.add("list_one");
        list.add("list_two");
        list.add("list_three");
        list.add("list_four");


        StepSixBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step6);
        binding.setList(list);
        binding.setMap(map);
        binding.setSparse(sparseArray);
        binding.setIndex(3);
        binding.setKey("key2");
        UserStep6 user = new UserStep6("Step6_firstName", "Step6_lastName");
        binding.setUser(user);
    }
}
