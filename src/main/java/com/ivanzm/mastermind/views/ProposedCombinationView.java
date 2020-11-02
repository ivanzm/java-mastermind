package com.ivanzm.mastermind.views;

import com.ivanzm.mastermind.models.Color;
import com.ivanzm.mastermind.models.Combination;
import com.ivanzm.mastermind.models.Error;
import com.ivanzm.mastermind.models.ProposedCombination;
import com.ivanzm.utils.Console;

class ProposedCombinationView {

    private ProposedCombination proposedCombination;

    ProposedCombinationView(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    private Error checkError(String combination) {
        if (combination.length() != Combination.MAX_HOLES) {
            return Error.LENGTH;
        }
        for (int i = 0; i < combination.length(); i++) {
            Color color = ColorView.getInstance(combination.charAt(i));
            if (!ColorView.contains(color)) {
                return Error.COLOR;
            }

            if (this.hasDuplicates(combination, color)) {
                return Error.DUPLICATE;
            }

            proposedCombination.getCombination()[i] = color;
        }
        return null;
    }

    private boolean hasDuplicates(String combination, Color color) {
        for (int i = 0; i < combination.length(); i++) {
            if (this.ocurrences(combination, color) != 1) {
                return true;
            }
        }
        return false;
    }

    private int ocurrences(String combination, Color color) {
        int ocurrences = 0;
        for (int i = 0; i < combination.length(); i++) {
            if (ColorView.getInstance(combination.charAt(i)) == color) {
                ocurrences++;
            }
        }
        return ocurrences;
    }

    void write() {
        for (Color color : this.proposedCombination.getCombination()) {
            new ColorView(color).print();
        }
    }

    void read() {
        Error error;
        do {
            MessageView.writeln("");
            MessageView.PROPOSED_COMBINATION.writeln();
            error = this.checkError(Console.instance().readString());

            if (error != null) {
                new ErrorView(error).writeln();
                proposedCombination.reset();
            }
        } while (error != null);
    }
}
