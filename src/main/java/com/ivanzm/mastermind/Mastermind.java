package com.ivanzm.mastermind;

public class Mastermind {

    private Board board;

    public void play() {
        do {
            this.playGame();
        } while (!this.isResumedGame());
    }

    private void playGame() {
        Message.TITLE.writeln();
        this.board = new Board();
        do {
            this.board.print();
            ProposedCombination proposedCombination = new ProposedCombination();
            proposedCombination.read();
            this.board.add(proposedCombination);
        } while (!this.board.isFinished());
    }

    private boolean isResumedGame() {
        return false;
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
