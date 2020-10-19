package com.ivanzm.mastermind;

public class Result {
    public static final int MAX_HOLES = 4;
    int whites, blacks = 0;

    Result(int whites, int blacks) {
        this.whites = whites;
        this.blacks = blacks;
    }

    boolean isWinner() {
        return this.blacks == Result.MAX_HOLES;
    }

    void print() {
        Message.write(" --> ");
        Message.write(this.blacks);
        Message.RESULT_BLACKS.write();
        Message.write(this.whites);
        Message.RESULT_WHITES.write();
        Message.writeln("");
    }
}
