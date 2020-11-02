package com.ivanzm.mastermind.models;

public abstract class Combination {
    public static final int MAX_HOLES = 4;
    protected Color[] combination;

    protected Combination() {
        combination = new Color[MAX_HOLES];
    }
}
