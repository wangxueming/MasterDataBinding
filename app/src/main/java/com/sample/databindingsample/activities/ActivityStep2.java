package com.sample.databindingsample.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sample.databindingsample.R;
import com.sample.databindingsample.UserStep1;
import com.sample.databindingsample.databinding.StepTwoBinding;
import com.sample.databindingsample.databinding.UserItemBinding;
import com.sample.databindingsample.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ActivityStep2 extends AppCompatActivity {
/*
* 第二步，实现一个RecycleView中捆绑数据
* recycleView需要设置些属性。
* binding里头可以直接获取到RecycleView，不需要再find.
* binding中RecycleView的ID是经过变化的，请仔细看一下。
* adapter本身不能直接设置vm。通过item单独bind实现的。
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StepTwoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_step2);

        binding.step2List.setHasFixedSize(true);
        binding.step2List.setLayoutManager(new LinearLayoutManager(this));
        binding.step2List.setAdapter(new UserAdapter());
    }

    public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
        private static final int USER_COUNT = 10;

        @NonNull
        private List<UserStep1> mUsers;

        public UserAdapter() {
            mUsers = new ArrayList<>(10);
            for (int i = 0; i < USER_COUNT; i ++) {
                UserStep1 user = new UserStep1(Randoms.nextFirstName(), Randoms.nextLastName());
                mUsers.add(user);
            }
        }

        public class UserHolder extends RecyclerView.ViewHolder {
            private UserItemBinding mBinding;

            public UserHolder(View itemView) {
                super(itemView);
            /*
            *
            * 如果你在ListView或者RecyclerView adapter使用Data Binding时，你可能会使用：
            * ListItemBinding binding = ListItemBinding.inflate(layoutInflater, viewGroup, false);
            * //or
            * ListItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item, viewGroup, false);
            *
            * */
                mBinding = DataBindingUtil.bind(itemView);
            }

            public void bind(@NonNull UserStep1 user) {
                mBinding.setUser(user);
            }
        }

        @Override
        public UserHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.user_item, viewGroup, false);
            return new UserAdapter.UserHolder(itemView);
        }

        @Override
        public void onBindViewHolder(UserHolder holder, int position) {
            holder.bind(mUsers.get(position));
        }

        @Override
        public int getItemCount() {
            return mUsers.size();
        }
    }
}
