package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

public class SecretCombination extends Combination {

    SecretCombination() {
        super();
        for (int i = 0; i < Result.MAX_HOLES; i++) {
            this.combination[i] = Color.random();
        }
    }

    Result getResult(ProposedCombination proposedCombination) {

        return null;
    }


    boolean matchCombination(ProposedCombination proposedCombination) {
        return false;
    }

    void println() {
        Console.instance().write("xxxx - ");
        for (Color color : this.combination) {
            color.print();
        }
    }
}
