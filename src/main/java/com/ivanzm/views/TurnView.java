package com.ivanzm.views;

import com.ivanzm.mastermind.Game;
import com.ivanzm.mastermind.ProposedCombination;

public class TurnView {
    private Game game;

    TurnView(Game game) {
        this.game = game;
    }

    boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
        proposedCombinationView.read();
        this.game.add(proposedCombination);

        MessageView.writeln("");
        MessageView.ATTEMPTS.write();
        MessageView.writeln(this.game.getAttemps());
        for (int i = 0; i < game.getAttemps(); i++) {
            new ProposedCombinationView(game.getProposedCombinations()[i]).write();
            new ResultView(game.getResults()[i]).writeln();
        }
        return printFinalResult();
    }

    private boolean printFinalResult() {
        if (this.game.isWinner()) {
            MessageView.WINNER.writeln();
            return true;
        } else if (this.game.isLooser()) {
            MessageView.LOOSER.writeln();
            return true;
        } else {
            return false;
        }
    }

}
