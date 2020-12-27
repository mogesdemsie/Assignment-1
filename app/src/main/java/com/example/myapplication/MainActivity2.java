package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView mytexta2;
    TextView mytexta1;
    private String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mytexta2=(TextView)findViewById(R.id.textView2);
        mytexta1=(TextView)findViewById(R.id.textView);
        st=getIntent().getStringExtra("value");

        mytexta2.setText(st);
    }
}