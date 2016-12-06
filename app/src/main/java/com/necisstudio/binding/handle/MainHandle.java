package com.necisstudio.binding.handle;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.necisstudio.binding.view.BasicActivity;
import com.necisstudio.binding.view.EventClickActivity;

/**
 * Created by vim on 05/12/16.
 */

public class MainHandle {
    private Context context;

    public MainHandle(Context context) {
        this.context = context;
    }

    public void onClickBasic(View view) {
        Intent intent = new Intent(context, BasicActivity.class);
        context.startActivity(intent);
    }

    public void onClickEvent(View view) {
        Intent intent = new Intent(context, EventClickActivity.class);
        context.startActivity(intent);
    }

    public void onClickRecycleView(View view) {
        Log.e("data", "bisa");
    }

}
