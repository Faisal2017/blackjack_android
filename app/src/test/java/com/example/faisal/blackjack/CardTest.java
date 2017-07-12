package com.example.faisal.blackjack;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by Faisal on 12/07/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Rank.KING, Suit.CLUBS);
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void canReturnString() {
        assertEquals("KING OF CLUBS", card.toString());
    }
}
