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

            if (this.hasDuplicates(combination, color)) {
                return Error.DUPLICATE;
            }

            this.combination[i] = color;
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

    private int ocurrences(String combination, Color color) {
        int ocurrences = 0;
        for (int i = 0; i < combination.length(); i++) {
            if (Color.getInstance(combination.charAt(i)) == color) {
                ocurrences++;
            }
        }
        return ocurrences;
    }

    boolean contains(Color color) {
        for (Color colorCombination : this.combination) {
            if (colorCombination == color) {
                return true;
            }
        }
        return false;
    }

    boolean contains(Color color, int position) {
        return this.combination[position] == color;
    }
}
