package com.necisstudio.binding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.necisstudio.binding.R;
import com.necisstudio.binding.databinding.ItemRecycleviewBinding;
import com.necisstudio.binding.model.Article;
import com.necisstudio.binding.viewmodel.DataBinder;

import java.util.ArrayList;

/**
 * Created by vim on 06/12/16.
 */

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.CustomViewHolder> {
    ArrayList<Article> modellist;

    public RecycleViewAdapter(ArrayList<Article> modellist) {
        this.modellist = modellist;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemRecycleviewBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_recycleview, parent, false);
        return new CustomViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        ItemRecycleviewBinding viewDataBinding = holder.mViewDataBinding;
        viewDataBinding.setArticle(modellist.get(position));
    }


    @Override
    public int getItemCount() {
        return (null != modellist ? modellist.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ItemRecycleviewBinding mViewDataBinding;

        public CustomViewHolder(ItemRecycleviewBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            this.mViewDataBinding = viewDataBinding;
        }
    }
}
