package com.ivanzm.mastermind.models;

public class ProposedCombination extends Combination {

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

    public void reset() {
        this.combination = new Color[Combination.MAX_HOLES];
    }

    public Color[] getCombination() {
        return this.combination;
    }
}
