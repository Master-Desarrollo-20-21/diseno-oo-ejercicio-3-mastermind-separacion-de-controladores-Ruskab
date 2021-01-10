package ikab.dev.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private SecretCombination secretCombination;
    private Attempt currentAttempt;
    private List<Attempt> playedAttempts;

    public Game() {
        this.init();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        currentAttempt = new Attempt(proposedCombination, secretCombination);
        playedAttempts.add(currentAttempt);
    }

    public boolean isContinuePlaying() {
        return playedAttempts.size() < 10 && !currentAttempt.isWinnerAttempt();
    }

    public boolean isWinnerGame() {
        return currentAttempt.isWinnerAttempt();
    }

    public int getAttemptsCount() {
        return playedAttempts.size();
    }

    public List<Attempt> getPlayedAttempts() {
        return playedAttempts;
    }

    public void init() {
        this.playedAttempts = new ArrayList<>();
        this.currentAttempt = null;
        this.secretCombination = new SecretCombination();
    }
}
