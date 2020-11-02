package com.ivanzm.mastermind.models;

import java.util.Random;

public class SecretCombination extends Combination {

    SecretCombination() {
        super();
        do {
            for (int i = 0; i < Combination.MAX_HOLES; i++) {
                this.combination[i] = Color.values()[new Random().nextInt(Color.values().length)];
            }
        } while (this.hasDuplicates());
    }

    private boolean hasDuplicates() {
        int values = 0;
        for (Color color : this.combination) {
            for (Color value : this.combination) {
                if (color.equals(value)) {
                    values++;
                }
            }
        }
        return values != Combination.MAX_HOLES;
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
}
