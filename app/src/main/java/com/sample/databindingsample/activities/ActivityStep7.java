package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep7;
import com.sample.databindingsample.UserStep7Plain;
import com.sample.databindingsample.databinding.StepSevenBinding;


public class ActivityStep7 extends AppCompatActivity {
/*
* 第七步，监听数据变化并作出反应。
* 需要在Data类中的需要添加监听的属性函数头上添加@Bindable  的注解。
* 在BR类文件中生成一个Entry。BR类文件会在模块包内生成。如果用于Data类的基类不能改变，Observable接口通过方便的PropertyChangeRegistry来实现用于储存和有效地通知监听器。
* 这里有3个user，一定都要设置一遍。不然就会有nullpointexception。
* UserStep7Plain 适用那种没几个属性，又不想写setter getter的人
* ObservableArrayMap 简单的几个字符串的改变。就这样了。
* 好好体会下这三种形式。。。
* 注意：xml中的user属性，对应的是函数名称！！！
* */

    UserStep7 user = new UserStep7("Step7_firstName", "Step7_lastName");
    UserStep7Plain userPlain = new UserStep7Plain();
    private ObservableArrayMap<String, Object> mapUser = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepSevenBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step7);
        setMineName(null);
        binding.setUser(user);
        binding.setPlainUser(userPlain);
        binding.setMapUser(mapUser);
    }

    public void setMineName(View view) {
        user.setFirstNameB("mine_first");
        user.setLastName("mine_last");

        userPlain.firstName.set("mine_first");
        userPlain.lastName.set("mine_last");
        userPlain.age.set(112);

        mapUser.put("firstName", "mine_first");
        mapUser.put("lastName", "mine_last");
        mapUser.put("age", 112);
    }

    public void setHisName(View view) {
        user.setFirstNameB("his_first");
        user.setLastName("his_last");

        userPlain.firstName.set("his_first");
        userPlain.lastName.set("his_last");
        userPlain.age.set(50);

        mapUser.put("firstName", "his_first");
        mapUser.put("lastName", "his_last");
        mapUser.put("age", 50);
    }
}
