package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnumber;
    EditText secondnumber;
    TextView ans;
    Button add;
    Button sub;
    Button mul;
    Button div;
    int a;
    int b;
    int c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber=findViewById(R.id.edFirstNumber);
        secondnumber=findViewById(R.id.edSecondNumber);
        ans=findViewById(R.id.textViewAns);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSubtract);
        mul=findViewById(R.id.btnMultiply);
        div=findViewById(R.id.btnDivide);





        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Integer.parseInt(firstnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                c =a+b;
                ans.setText("Ans is "+c);


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Integer.parseInt(firstnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                c =a/b;
                ans.setText("Ans is "+c);


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Integer.parseInt(firstnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                c =a-b;
                ans.setText("Ans is "+c);


            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a= Integer.parseInt(firstnumber.getText().toString());
                b=Integer.parseInt(secondnumber.getText().toString());
                c =a*b;
                ans.setText("Ans is "+c);


            }
        });
    }





}
