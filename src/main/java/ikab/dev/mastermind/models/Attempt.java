package ikab.dev.mastermind.models;

public class Attempt {

    private final ProposedCombination proposedCombination;
    private final SecretCombination secretCombination;

    public Attempt(ProposedCombination proposedCombination, SecretCombination secretCombination) {
        this.proposedCombination = proposedCombination;
        this.secretCombination = secretCombination;
    }

    public boolean isWinner() {
        return secretCombination.isCorrectCombination(proposedCombination);
    }

    public int getWhites() {
        return secretCombination.getWhites(proposedCombination);
    }

    public int getBlacks() {
        return secretCombination.getBlacks(proposedCombination);
    }

    public String getProposedCombinationCode() {
        return proposedCombination.getColorsCode();
    }

}
