package com.example.faisal.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    Game game = new Game();
    Player dealer = new Player("dealer");
    Player player = new Player("player");

    ArrayList<Player> winners;
    TextView dealer_cards;
    TextView player_cards;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        dealer_cards = (TextView) findViewById(R.id.view_dealer_cards);
        player_cards = (TextView) findViewById(R.id.view_player_cards);
        resultText = (TextView) findViewById(R.id.show_result);

        game.getDeck().shuffle();

        game.dealCardFromDeck(dealer);
        game.dealCardFromDeck(dealer);

        Card dealer1 = dealer.getHand().get(0);
        Card dealer2 = dealer.getHand().get(1);
        int dealerValue = game.checkValue(dealer.getHand());

        dealer_cards.setText(dealer1.toString() + "\n" + dealer2.toString() + "\n" + "Score : " +
                dealerValue);

        game.dealCardFromDeck(player);
        game.dealCardFromDeck(player);

        Card player1 = player.getHand().get(0);
        Card player2 = player.getHand().get(1);
        int playerValue = game.checkValue((player.getHand()));

        player_cards.setText(player1.toString() + "\n" + player2.toString() + "\n" + "Score : " +
                playerValue);

//        winners = new ArrayList<Player>(game.compareHands());
//        String win = game.checkWinner(winners);
//        resultText.setText(win);


        String winner = game.compareHands(dealer, player);
        resultText.setText(winner);
    }


}
