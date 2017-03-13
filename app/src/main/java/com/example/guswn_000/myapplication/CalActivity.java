package com.example.guswn_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalActivity extends AppCompatActivity {
    EditText n1,n2;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        this.setTitle("계산기");
        n1 = (EditText)findViewById(R.id.cale1);
        n2 = (EditText)findViewById(R.id.cale2);
        b1 = (Button)findViewById(R.id.button4);
        b2 = (Button)findViewById(R.id.button5);
        b3 = (Button)findViewById(R.id.button6);
        b4 = (Button)findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (n1.getText().toString().equals("") || n2.getText().toString().equals(""))
                {
                    emptyornot();
                }
                else
                {
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    int plusres = num1+num2;
                    Toast.makeText(getApplicationContext(),"더하기 계산 결과는 "+plusres+"입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (n1.getText().toString().equals("") || n2.getText().toString().equals(""))
                {
                    emptyornot();
                }
                else
                {
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    int minusres;
                    if(num1 >= num2)
                    {minusres = num1 - num2;}
                    else
                    {minusres = num2 - num1;}
                    Toast.makeText(getApplicationContext(),"빼기 계산 결과는 "+minusres+"입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (n1.getText().toString().equals("") || n2.getText().toString().equals(""))
                {
                    emptyornot();
                }
                else
                {
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    int timeres = num1*num2;
                    Toast.makeText(getApplicationContext(),"곱하기 계산 결과는 "+timeres+"입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (n1.getText().toString().replace(" ","").equals("") || n2.getText().toString().replace(" ","").equals(""))
                {
                    emptyornot();
                }
                else
                {
                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());
                    double divideres;
                    if(num1 >= num2)
                    {
                        divideres = (num1 / num2);
                    }
                    else
                    {
                        divideres = num2 / num1;
                    }
                    Toast.makeText(getApplicationContext(),"나누기 계산 결과는 "+(int)divideres+"입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void emptyornot()
    {
        if (n1.getText().toString().replace(" ","").equals(""))
        {
            Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
            n1.requestFocus();
        }
        else if (n2.getText().toString().replace(" ","").equals(""))
        {
            Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
            n2.requestFocus();
        }
        else if (n1.getText().toString().replace(" ","").equals("") && n2.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
            n1.requestFocus();
        }
    }
}
