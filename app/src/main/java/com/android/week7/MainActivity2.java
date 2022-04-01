package com.android.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv_lai,tv_tongtien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_lai = (TextView)findViewById(R.id.tv_lai);
        tv_tongtien = (TextView)findViewById(R.id.tv_tongtien);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        String tien = intent.getStringExtra("tiengui");

        int lai = Integer.parseInt(result);
        int tiengui = Integer.parseInt(tien);

        tv_lai.setText(result);
        tv_tongtien.setText(Integer.toString(lai + tiengui));
    }
}