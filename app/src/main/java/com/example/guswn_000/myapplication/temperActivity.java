package com.example.guswn_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class temperActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temper);
        this.setTitle("온도변환기");
        e1 = (EditText)findViewById(R.id.tempere1);
        e2 = (EditText)findViewById(R.id.tempere2);
        b1 = (Button)findViewById(R.id.tempb1);
        b2 = (Button)findViewById(R.id.tempb2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String supc = e1.getText().toString();
                double hwacal = Integer.parseInt(supc) * 1.8 + 32;
                Toast.makeText(getApplicationContext(),"화씨 온도는 "+hwacal+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hwac = e2.getText().toString();
                double supcal = (Integer.parseInt(hwac) - 32) / 1.8;
                Toast.makeText(getApplicationContext(),"섭씨 온도는 "+supcal+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
