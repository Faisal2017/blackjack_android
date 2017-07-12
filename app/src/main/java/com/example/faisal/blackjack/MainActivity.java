package com.example.faisal.blackjack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(getClass().toString(), "onCreate called");

        playButton = (Button) findViewById(R.id.play_button);
    }

    public void onPlayButtonClicked(View Button) {

        Log.d(getClass().toString(), "onPlayButtonClicked was called");

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
