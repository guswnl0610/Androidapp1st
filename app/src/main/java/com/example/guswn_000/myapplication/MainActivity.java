package com.example.guswn_000.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("메뉴");
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ageintent = new Intent(MainActivity.this, AgeActivity.class);
                startActivity(ageintent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temperintent = new Intent(MainActivity.this, temperActivity.class);
                startActivity(temperintent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restintent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restintent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calintent = new Intent(MainActivity.this, CalActivity.class);
                startActivity(calintent);
            }
        });

    }
}
