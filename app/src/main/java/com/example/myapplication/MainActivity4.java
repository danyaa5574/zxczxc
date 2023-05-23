package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    //Initializing thetextView
    TextView textView;
    textView = findViewById(R.id.hint);

        new CountDownTimer(60000, 1000)
    {
        @Override
        public void onTick(long millisUntilFinished) {
        //Used for formatting digit to be in 2 digits only
        NumberFormat f = new DecimalFormat("00");

        long sec = (millisUntilFinished/ 1000) % 60;
        textView.setText("Отправить код повторно можно будет через " + f.format(sec) + " секунд");
    }
        //When the ask is over it will print 00:00:00 there
        public void onFinish() {
        textView.setText("Отправить код повторно можно будет через 0 секунд");
    }
    }.start();
        }
}
}


