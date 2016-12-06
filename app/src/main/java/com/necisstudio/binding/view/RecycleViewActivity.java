package com.necisstudio.binding.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.necisstudio.binding.R;
import com.necisstudio.binding.adapter.RecycleViewAdapter;
import com.necisstudio.binding.model.Article;

import java.util.ArrayList;

/**
 * Created by vim on 06/12/16.
 */

public class RecycleViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Article> modellist = new ArrayList<>();
        RecycleViewAdapter adapter = new RecycleViewAdapter(modellist);
        recyclerView.setAdapter(adapter);

        Article item = new Article();
        item.setTitle("MVVM 1");
        item.setContent("Bisa");
        item.setLogo("http://img.monitorday.com/dinamis/detail/20605.jpg");
        modellist.add(0, item);
        modellist.add(1, item);
        modellist.add(2, item);
        modellist.add(3, item);
        adapter.notifyDataSetChanged();
    }
}
