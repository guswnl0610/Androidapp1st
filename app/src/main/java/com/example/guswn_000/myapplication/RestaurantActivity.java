package com.example.guswn_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1;
    CheckBox cb1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        e1 = (EditText)findViewById(R.id.reste1);
        e2 = (EditText)findViewById(R.id.reste2);
        e3 = (EditText)findViewById(R.id.reste3);
        b1 = (Button)findViewById(R.id.restb1);
        cb1 = (CheckBox)findViewById(R.id.restcheckbox);
        t1 = (TextView)findViewById(R.id.textView10);
        t2 = (TextView)findViewById(R.id.textView11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizzacount = e1.getText().toString();
                String pastacount = e2.getText().toString();
                String saladcount = e3.getText().toString();
                int totalcount = Integer.parseInt(pizzacount) + Integer.parseInt(pastacount) + Integer.parseInt(saladcount);
                String count = totalcount +"개";
                t1.setText(count);
                int totalprice = Integer.parseInt(pizzacount)*15000 + Integer.parseInt(pastacount)*13000 + Integer.parseInt(saladcount)*9000;

                if(cb1.isChecked())
                {
                    String price1 = (totalprice * 9/10) +"원";
                    t2.setText(price1);
                }
                else
                {
                    String price2 = totalprice+"원";
                    t2.setText(price2);
                }
            }
        });
    }
}
