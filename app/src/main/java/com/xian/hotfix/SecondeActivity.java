package com.xian.hotfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.meituan.robust.patch.annotaion.Modify;

public class SecondeActivity extends AppCompatActivity {

    TextView t;

    @Override
    @Modify
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        t = (TextView) findViewById(R.id.text);
        t.setText("未修改");
        //t.setText("已经修改");
    }
}
