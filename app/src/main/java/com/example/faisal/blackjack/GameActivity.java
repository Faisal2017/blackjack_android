package com.example.faisal.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Game game = new Game();
    Player dealer = new Player("dealer");
    Player player = new Player("player");
    TextView dealer_cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        dealer_cards = (TextView) findViewById(R.id.view_dealer_cards);

        game.getDeck().shuffle();
    }






}
