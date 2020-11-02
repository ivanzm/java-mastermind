package com.ivanzm.mastermind.models;

public class Result {
    int whites, blacks = 0;

    Result(int whites, int blacks) {
        this.whites = whites;
        this.blacks = blacks;
    }

    boolean isWinner() {
        return this.blacks == Combination.MAX_HOLES;
    }

    public int getWhites() {
        return whites;
    }

    public int getBlacks() {
        return blacks;
    }
}
