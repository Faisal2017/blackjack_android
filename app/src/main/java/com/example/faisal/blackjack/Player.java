package com.example.faisal.blackjack;

import java.util.ArrayList;

/**
 * Created by Faisal on 12/07/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return new ArrayList<Card>(hand);
    }

}

