package com.necisstudio.binding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.necisstudio.binding.R;
import com.necisstudio.binding.databinding.ActivityEventclickBinding;
import com.necisstudio.binding.viewmodel.EventClickHandle;

/**
 * Created by vim on 06/12/16.
 */

public class EventClickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEventclickBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_eventclick);
        EventClickHandle handle = new EventClickHandle();
        binding.setHandleclick(handle);
    }
}
