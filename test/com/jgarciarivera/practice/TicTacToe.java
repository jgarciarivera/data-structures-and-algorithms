package com.jgarciarivera.practice;

public class TicTacToe {

    public enum Peg { EMPTY, FIRST, SECOND }
    private final int SIZE = 3;
    private Peg[][] cells = new Peg[SIZE][SIZE];
    private Peg currentPeg;

    public TicTacToe() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = Peg.EMPTY;
            }
        }
        currentPeg = Peg.FIRST;
    }

    public String winner() {
        return "none";
    }

    public Peg placePeg(int row, int column) {
        if (cells[row][column] == Peg.EMPTY) {
            cells[row][column] = currentPeg;
            currentPeg = togglePeg();
        }
        return cells[row][column];
    }

    private Peg togglePeg() {
        return (currentPeg == Peg.FIRST) ? Peg.SECOND : Peg.FIRST;
    }

    public Peg isARowMatch() {
        for (int i = 0; i < SIZE; i++) {
            if (cells[i][0] == cells[i][1]
                    && cells[i][1] == cells[i][2]
                    && cells[i][0] != Peg.EMPTY) {
                return cells[i][0];
            }
        }
        return Peg.EMPTY;
    }
}
