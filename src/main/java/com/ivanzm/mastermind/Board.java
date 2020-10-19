package com.ivanzm.mastermind;

public class Board {
    private static final int MAX_ATTEMPS = 10;
    private int attemps;
    private Result[] results;
    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;

    Board() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        this.results = new Result[MAX_ATTEMPS];
        this.attemps = 0;
    }

    void add(ProposedCombination proposedCombination) {
        this.proposedCombinations[this.attemps] = proposedCombination;
        this.results[this.attemps] = this.secretCombination.getResult(proposedCombination);
    }

    boolean isFinished() {
        return false;
    }

    void print() {
        Message.ATTEMPTS.write();
        Message.write(String.valueOf(this.attemps));
        Message.writeln("");
        //this.secretCombination.
        for (int i = 0; i < this.attemps; i++) {
            this.proposedCombinations[i].println();
            this.results[i].print();
        }
    }
}
