package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView2;
    private RadioGroup radioGroup;
    private RadioButton radioBtn;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView2 = findViewById(R.id.textView2);
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int radioId = radioGroup.getCheckedRadioButtonId();
                radioBtn = findViewById(radioId);
                String rd = radioBtn.getText().toString();
                String m = "Meter";
                String text = editText.getText().toString();
                int num = Integer.parseInt(text);
                float num2 = Float.parseFloat(text);

                if(rd.equals(m)){
                    int result = 100 * num;
                    textView2.setText(String.valueOf(num)+" Meter = "+String.valueOf(result)+" Centimeters");
                }else{
                    float result = num2/100;
                    textView2.setText(String.valueOf(num)+" Centimeter = "+String.valueOf(result)+" Meter");
                }

            }
        });
    }
}