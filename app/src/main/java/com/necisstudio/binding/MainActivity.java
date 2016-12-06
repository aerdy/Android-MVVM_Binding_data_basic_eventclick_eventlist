package com.necisstudio.binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.necisstudio.binding.databinding.ActivityMainBinding;
import com.necisstudio.binding.model.Article;
import com.necisstudio.binding.viewmodel.MainHandle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainHandle handle = new MainHandle(this);
        binding.setHandleclick(handle);
    }
}
