package com.ivanzm.mastermind;

abstract class Combination {
    protected Color[] combination;

    protected Combination() {
        combination = new Color[Result.MAX_HOLES];
    }
}
