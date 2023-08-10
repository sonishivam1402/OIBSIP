package com.example.stopwatch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int milliSeconds = 0;
    boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        startTimer();
    }

    public void onClickStart(View view) {
        isRunning = true;
    }

    public void onClickStop(View view) {
        isRunning = false;
    }

    public void onClickReset(View view) {
        isRunning = false;
        milliSeconds = 0;
    }

    public void startTimer(){
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                int ms = milliSeconds%10;
                int s = milliSeconds/10;
                int m = s/60;
                int h = m/60;

                if(isRunning){
                    milliSeconds++;
                }

                String formatString = String.format(Locale.getDefault(),"%02d:%02d:%02d:%02d",h,m,s,ms);
                textView.setText(formatString);
                handler.postDelayed(this,100);
            }
        };
        handler.post(runnable);
    }

}