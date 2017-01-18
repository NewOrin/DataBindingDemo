package com.neworin.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.neworin.databindingdemo.databinding.ActivityMainLayoutBinding;

/**
 * <b>Create Date:</b> 01/14/2017<br>
 * <b>Author:</b> NewOrin <br>
 * <b>Description:</b>
 * <br>
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainLayoutBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main_layout);
        User user = new User("1","neworin","123","male");
        binding.setUser(user);
        binding.setHandlers(new EventHandler(this));
    }
}
