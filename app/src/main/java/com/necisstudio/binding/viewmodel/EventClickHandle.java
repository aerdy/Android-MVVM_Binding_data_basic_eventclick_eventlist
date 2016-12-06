package com.necisstudio.binding.viewmodel;

import android.util.Log;
import android.view.View;

import com.necisstudio.binding.R;
import com.necisstudio.binding.databinding.ActivityEventclickBinding;
import com.necisstudio.binding.model.Article;

/**
 * Created by vim on 06/12/16.
 */

public class EventClickHandle {
    ActivityEventclickBinding binding;
    public EventClickHandle(ActivityEventclickBinding binding){
        this.binding = binding;
    }
    public void onClickAdd(View view) {
        Article item = new Article();
        item.setTitle("MVVM");
        item.setContent("Bisa");
        binding.setArticle(item);
        Log.e("data", "bisa");
    }
}
