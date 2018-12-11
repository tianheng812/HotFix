package com.xian.hotfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.meituan.robust.PatchExecutor;


public class MainActivity extends AppCompatActivity {

    Button btn;
    Button seconde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        btn = (Button) findViewById(R.id.btn);
        seconde= (Button) findViewById(R.id.btn_seconde);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new PatchExecutor(getApplicationContext(), new PatchManipulateImp(), new RobustCallBackSample()).start();
            }
        });
        seconde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondeActivity.class));
            }
        });
    }}

