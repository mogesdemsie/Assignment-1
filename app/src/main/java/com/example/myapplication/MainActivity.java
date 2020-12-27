package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter=0;
    TextView text1;
    public String st;
    private Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.moges);
        button2 = (Button) findViewById(R.id.buttonid2);
        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
            }

        });*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = Integer.parseInt(text1.getText().toString());
                counter = counter + 1;
                text1.setText(Integer.toString(counter));

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openMainActivity2();

            }
        });

    }
    public void openMainActivity2()
    {
        Intent intent=new Intent(this, MainActivity2.class);
        st=text1.getText().toString();
        intent.putExtra("value", st);

        startActivity(intent);
        finish();

    }
    }
