package com.ivanzm.mastermind;

public class Result {
    public static final int MAX_HOLES = 4;
    int whites, blacks = 0;

    Result(int whites, int blacks) {
        this.whites = whites;
        this.blacks = blacks;
    }

    boolean isWinner() {
        return false;
    }

    void print() {
        System.out.println("");
    }
}
