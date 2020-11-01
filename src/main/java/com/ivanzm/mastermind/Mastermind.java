package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

public class Mastermind {

    private Board board;

    public void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
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
        this.board.printFinalResult();
    }

    private boolean isResumedGame() {
        final char AFFIRMATIVE = 'y';
        final char NEGATIVE = 'n';
        boolean error;
        char answer;
        do {
            Message.RESUME.writeln();
            answer = Console.instance().readChar("");
            error = answer != AFFIRMATIVE && answer != NEGATIVE;
        } while (error);

        return answer == AFFIRMATIVE;
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
