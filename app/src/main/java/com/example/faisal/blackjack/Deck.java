package com.example.faisal.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Faisal on 12/07/2017.
 */

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
        this.setUpDeck();
    }

    public void setUpDeck() {
        this.deck = new ArrayList<Card>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {

                Card card = new Card(rank, suit);
                // System.out.println(card);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void removeCard(int index) {
        this.deck.remove(index);
    }

    public Card getCard() {
        return deck.get(0);
    }

}
