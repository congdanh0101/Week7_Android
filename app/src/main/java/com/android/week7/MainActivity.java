package com.android.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText et_tiengui,et_laisuat,et_kyhan;
    Button btn_result;
    int tiengui,laisuat,kyhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_result = (Button) findViewById(R.id.btn_result);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumber()){
                    double result = tiengui*laisuat*(kyhan*30)/360;
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                    intent.putExtra("tiengui",tiengui);
//                    intent.putExtra("result",result);
                    MainActivity.this.startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"Please enter all value", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean getNumber(){
        et_tiengui = (EditText) findViewById(R.id.et_tiengui);
        et_laisuat = (EditText) findViewById(R.id.et_laisuat);
        et_kyhan = (EditText) findViewById(R.id.et_kyhan);

        String s1 = et_tiengui.getText().toString();
        String s2 = et_laisuat.getText().toString();
        String s3 = et_kyhan.getText().toString();

        if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) return false;
        else{
            tiengui  = Integer.parseInt(s1);
            laisuat = Integer.parseInt(s2);
            kyhan = Integer.parseInt(s3);
            return true;
        }
    }

}