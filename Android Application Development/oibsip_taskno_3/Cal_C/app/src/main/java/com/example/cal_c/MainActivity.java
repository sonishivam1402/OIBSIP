package com.example.cal_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnSub,btnMulti,btnDiv,btnEqual,btnAC;
    EditText NumInput;
    double Num1=0.0, Num2=0.0;
    boolean Add, Sub, Multi, Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);
        btnAC = findViewById(R.id.btnAC);
        NumInput = findViewById(R.id.NumInput);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText(NumInput.getText() + "9");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumInput.setText("");
                Num1 = 0.0;
                Num2 = 0.0;
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NumInput.getText().length() > 0){
                    Num1 = Double.parseDouble(NumInput.getText().toString() + "");
                    Add = true;
                    NumInput.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NumInput.getText().length() > 0){
                    Num1 = Double.parseDouble(NumInput.getText().toString() + "");
                    Sub = true;
                    NumInput.setText("");
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NumInput.getText().length() > 0){
                    Num1 = Double.parseDouble(NumInput.getText().toString() + "");
                    Multi = true;
                    NumInput.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NumInput.getText().length() > 0){
                    Num1 = Double.parseDouble(NumInput.getText().toString() + "");
                    Div = true;
                    NumInput.setText("");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Add || Sub || Multi || Div){
                    Num2 = Double.parseDouble(NumInput.getText().toString() + "");
                }
                if(Add){
                    //Num2 = Float.parseFloat(NumInput.getText() + "");
                    NumInput.setText(Num1 + Num2 + "");
                    Add = false;
                }
                if(Sub){
                    NumInput.setText(Num1 - Num2 + "");
                    Sub = false;
                }
                if(Multi){
                    NumInput.setText(Num1 * Num2 + "");
                    Multi = false;
                }
                if(Div){
                    NumInput.setText(Num1 / Num2 + "");
                    Div = false;
                }
            }
        });

    }
}