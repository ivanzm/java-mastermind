package com.ivanzm.views;

import com.ivanzm.mastermind.Game;
import com.ivanzm.utils.Console;

public class ResumeView {
    private Game game;

    ResumeView(Game game) {
        this.game = game;
    }

    boolean interact() {
        final char AFFIRMATIVE = 'y';
        final char NEGATIVE = 'n';
        boolean error;
        char answer;
        do {
            MessageView.RESUME.writeln();
            answer = Console.instance().readChar("");
            error = answer != AFFIRMATIVE && answer != NEGATIVE;
        } while (error);

        if (answer == AFFIRMATIVE) {
            this.game.reset();
            return true;
        }

        return false;
    }
}
