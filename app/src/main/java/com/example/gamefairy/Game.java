package com.example.gamefairy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    TextView timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        timer = findViewById(R.id.timer);

        new CountDownTimer(90000, 1000) {
            @Override
            public void onTick(long l) {
                timer.setText("" + l/60000 + " : " + ((l/1000) - (60 * (l/60000))));
            }

            @Override
            public void onFinish() {
                timer.setText("- : -");
            }
        }.start();
    }
}