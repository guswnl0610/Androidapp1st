package com.example.guswn_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgeActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        this.setTitle("나이 계산기");
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        e1 = (EditText)findViewById(R.id.agee1);
        e2 = (EditText)findViewById(R.id.agee2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = e1.getText().toString();
                int agecal = 2017 - Integer.parseInt(year) + 1;
                Toast.makeText(getApplicationContext(),"당신의 나이는 "+agecal+"세입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int yearcal = 2017 - Integer.parseInt(age) + 1;
                Toast.makeText(getApplicationContext(),"당신의 태어난 해는 "+yearcal+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
