package com.necisstudio.binding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.necisstudio.binding.R;
import com.necisstudio.binding.databinding.ActivityBasicBinding;
import com.necisstudio.binding.model.Article;

/**
 * Created by vim on 06/12/16.
 */

public class BasicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding bindingview = DataBindingUtil.setContentView(this, R.layout.activity_basic);

        Article user = new Article();
        user.setContent("MVVM data 2");
        user.setTitle("Binding 2");
        bindingview.setArticle(user);

    }
}
