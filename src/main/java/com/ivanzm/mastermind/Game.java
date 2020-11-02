package com.ivanzm.mastermind;

public class Game {
    private static final int MAX_ATTEMPS = 10;
    private int attemps;
    private Result[] results;
    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;

    Game() {
        this.reset();
    }

    public void add(ProposedCombination proposedCombination) {
        this.proposedCombinations[this.attemps] = proposedCombination;
        this.results[this.attemps] = this.secretCombination.getResult(proposedCombination);
        attemps++;
    }

    public void reset() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        this.results = new Result[MAX_ATTEMPS];
        this.attemps = 0;
    }

    public boolean isWinner() {
        return this.results[this.attemps - 1].isWinner();
    }

    public boolean isLooser() {
        return this.attemps == MAX_ATTEMPS;
    }


    public int getAttemps() {
        return attemps;
    }

    public Color[] getSecretCombination() {
        return secretCombination.combination;
    }

    public Result[] getResults() {
        return results;
    }

    public ProposedCombination[] getProposedCombinations() {
        return proposedCombinations;
    }
}
