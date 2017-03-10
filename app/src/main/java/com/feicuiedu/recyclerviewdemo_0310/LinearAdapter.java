package com.feicuiedu.recyclerviewdemo_0310;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by gqq on 2017/3/10.
 */

// 适配器
public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.ViewHolder>{

    private List<String> mData = new ArrayList<>();

    // 数据的填充
    public void setData(List<String> data){
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    // 创建视图的ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    // 视图和数据进行绑定
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvItem.setText(mData.get(position));
    }

    // item数量
    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item_text)
        TextView mTvItem;

         public ViewHolder(View itemView) {
             super(itemView);
             // 使用Butterknife
             ButterKnife.bind(this,itemView);
         }
     }
}
