package com.example.faisal.blackjack;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

/**
 * Created by Faisal on 12/07/2017.
 */

public class PlayerTest {

    private Player player;

    @Before
    public void Before() {
        player = new Player("Player One");
    }

    @Test
    public void testhasName() {
        assertEquals("Player One", player.getName());
    }

}
