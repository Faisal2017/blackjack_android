package com.example.faisal.blackjack;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

/**
 * Created by Faisal on 12/07/2017.
 */

public class DeckTest {

    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void testDeckNumbers() {
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void testDeckShuffle() {
        deck.shuffle();
        assertNotNull(deck.getCard());
    }

    @Test
    public void testFirstCardRank() {
        assertEquals(Rank.ACE, deck.getCard().getRank());
    }

    @Test
    public void testFirstCardSuit() {
        assertEquals(Suit.HEARTS, deck.getCard().getSuit());
    }
}
