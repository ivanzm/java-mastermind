package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

public class SecretCombination extends Combination {

    SecretCombination() {
        super();
        do {
            for (int i = 0; i < Result.MAX_HOLES; i++) {
                this.combination[i] = Color.random();
            }
        } while (this.hasDuplicates());
    }

    private boolean hasDuplicates() {
        int values = 0;
        for (int i = 0; i < this.combination.length; i++) {
            for (int j = 0; j < this.combination.length; j++) {
                if (this.combination[i].equals(this.combination[j])) {
                    values++;
                }
            }
        }
        return values != Result.MAX_HOLES;
    }

    Result getResult(ProposedCombination proposedCombination) {
        int blacks = 0, whites = 0;
        for (int i = 0; i < this.combination.length; i++) {
            if (proposedCombination.contains(this.combination[i])) {
                whites++;
            }
            if (proposedCombination.contains(this.combination[i], i)) {
                blacks++;
            }
        }
        return new Result(whites, blacks);
    }

    void println() {
        Console.instance().write("xxxx - ");
        for (Color color : this.combination) {
            color.print();
        }
    }
}
