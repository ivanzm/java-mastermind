package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

public class ProposedCombination extends Combination {

    private Error checkError(String combination) {
        if (combination.length() != Result.MAX_HOLES) {
            return Error.LENGTH;
        }
        for (int i = 0; i < combination.length(); i++) {
            Color color = Color.getInstance(combination.charAt(i));
            if (!Color.contains(color)) {
                return Error.COLOR;
            }
            this.combination[i] = color;
        }
        return null;
    }

    void read() {
        Error error;
        do {
            Message.PROPOSED_COMBINATION.writeln();
            error = this.checkError(Console.instance().readString());

            if (error != null) {
                error.writeln();
                this.combination = new Color[Result.MAX_HOLES];
            }
        } while (error != null);
    }

    void println() {
        for (Color color : this.combination) {
            color.print();
        }
    }
}
