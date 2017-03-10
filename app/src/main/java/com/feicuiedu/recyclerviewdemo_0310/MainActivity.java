package com.feicuiedu.recyclerviewdemo_0310;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnNormal,R.id.btnStagger})
    public void gotoOther(View view){
        switch (view.getId()){
            case R.id.btnNormal:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
            case R.id.btnStagger:
                break;
        }
    }
}
