package com.feicuiedu.recyclerviewdemo_0310;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

// RecyclerView的使用
public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        initView();

    }

    // 初始化布局相关
    private void initView() {

        // 1. 设置布局管理器：让他展示的样式是什么
        // StaggeredGridLayoutManager、LinearLayoutManager、GridLayoutManager
        // ListView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 2. 如果添加或删除item，可以设置动画,他为我们提供一个可以直接使用的动画：DefaultItemAnimator
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // 3. 设置分割线:默认提供的一个：DividerItemDecoration，都可以自己定义，可以在item布局中设置
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        // 4. 设置适配器
        mRecyclerView.setAdapter();
    }
}
