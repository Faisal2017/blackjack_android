package com.example.faisal.blackjack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Faisal on 12/07/2017.
 */

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private HashMap<Enum, Integer> cardRules;

    public Game() {
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
        cardRules = new HashMap<Enum, Integer>();

        cardRules.put(Rank.ACE, 11);
        cardRules.put(Rank.TWO, 2);
        cardRules.put(Rank.THREE, 3);
        cardRules.put(Rank.FOUR, 4);
        cardRules.put(Rank.FIVE, 5);
        cardRules.put(Rank.SIX, 6);
        cardRules.put(Rank.SEVEN, 7);
        cardRules.put(Rank.EIGHT, 8);
        cardRules.put(Rank.NINE, 9);
        cardRules.put(Rank.TEN, 10);
        cardRules.put(Rank.KING, 10);
        cardRules.put(Rank.QUEEN, 10);
        cardRules.put(Rank.JACK, 10);
    }

    //below method would only check the value if player had one card
    // public int checkValue(Card card){
    //   return cardRules.get(card.getRank());
    // }

    public Deck getDeck() {
        return this.deck;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int checkValue(ArrayList<Card> hand) {
        int valueOfCards = 0;

        for (Card card : hand) {
            valueOfCards += cardRules.get(card.getRank());
        }

        return valueOfCards;
    }

    public void dealCardFromDeck(Player player) {
        Card dealtCard = deck.getCard();
        deck.removeCard(0);
        player.addCardToHand(dealtCard);
    }
//
//    public ArrayList<Player> compareHands() {
//        int counter = checkValue(players.get(0).getHand());
//        ArrayList<Player> winners = new ArrayList<Player>();
//
//        winners.add(players.get(0));
//
//        if (checkValue(players.get(1).getHand()) == counter){
//            winners.add(players.get(1));
//        } else if (checkValue(players.get(1).getHand()) > counter) {
//            winners.remove(0);
//            winners.add(players.get(1));
//        }
//        return winners;
//    }

    public String checkWinner(ArrayList<Player> winners) {
        if (winners.size() == 1) {
            return "The winner is " + winners.get(0).getName() + " with a score of " + checkValue(winners.get(0).getHand());
        } else if (winners.size() == 2) {
            return "It's a draw, the score is " + checkValue(winners.get(0).getHand());
        }
        return null;
    }

    public String compareHands(Player dealer, Player player2) {

        ArrayList<Card> player1Hand = dealer.getHand();
        ArrayList<Card> player2Hand = player2.getHand();

        int player1Score = checkValue(player1Hand);
        int player2Score = checkValue(player2Hand);

        if (player1Score == player2Score) {
            return "It's A Draw!";
        } else if (player1Score > player2Score) {
            return "Dealer wins all your money";
        } else {
            return "You have won!";
        }
    }


}
