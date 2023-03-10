package com.jgarciarivera.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    TicTacToe ticTacToe;

    @BeforeEach
    public void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void gameWonByNoneAtStart() {
        assertEquals("none", ticTacToe.winner());
    }

    @Test
    public void placeFirstPeg() {
        assertEquals(TicTacToe.Peg.FIRST, ticTacToe.placePeg(0, 1));
    }

    @Test
    public void placeSecondPeg() {
        ticTacToe.placePeg(0, 2);
        assertEquals(TicTacToe.Peg.SECOND, ticTacToe.placePeg(0, 1));
    }

    @Test
    public void placePegAtOccupiedPosition() {
        ticTacToe.placePeg(2,1);
        assertEquals(TicTacToe.Peg.FIRST, ticTacToe.placePeg(2, 1));
    }

    @Test
    public void placePegOutOfRowRange() {
        try {
            ticTacToe.placePeg(5, 0);
            fail("Expected exception for stepping out of row bounds");
        } catch (IndexOutOfBoundsException e) { }
    }

    @Test
    public void placePegOutOfColumnRange() {
        try {
            ticTacToe.placePeg(0, 5);
            fail("Expected exception for stepping out of column bounds");
        } catch (IndexOutOfBoundsException e) {}
    }

    @Test
    public void winByRowMatch() {
        ticTacToe.placePeg(0, 0);
        ticTacToe.placePeg(1, 1);
        ticTacToe.placePeg(0, 1);
        ticTacToe.placePeg(2, 1);
        ticTacToe.placePeg(0, 2);
        assertEquals(TicTacToe.Peg.FIRST, ticTacToe.isARowMatch());
    }

    @Test
    public void noWinByRowMatch() {
        ticTacToe.placePeg(0, 1);
        ticTacToe.placePeg(1, 1);
        ticTacToe.placePeg(0, 1);
        ticTacToe.placePeg(2, 1);
        assertEquals(TicTacToe.Peg.EMPTY, ticTacToe.isARowMatch());
    }

    @Test
    public void firstPlayerIsWinnerOnRowMatch() {
        ticTacToe.placePeg(0, 0);
        ticTacToe.placePeg(1, 1);
        ticTacToe.placePeg(0, 1);
        ticTacToe.placePeg(2, 1);
        ticTacToe.placePeg(0, 2);
    }
}
