package ikab.dev.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private SecretCombination secretCombination;
    private List<Attempt> playedAttempts;

    public Game() {
        this.init();
    }

    public void init() {
        this.playedAttempts = new ArrayList<>();
        this.secretCombination = new SecretCombination();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        playedAttempts.add(new Attempt(proposedCombination, secretCombination));
    }

    public boolean isContinuePlaying() {
        return playedAttempts.size() < 10 && !isWinnerGame();
    }

    public boolean isWinnerGame() {
        return getLastAttempt().isWinner();
    }

    private Attempt getLastAttempt() {
        return playedAttempts.get(playedAttempts.size() - 1);
    }

    public int getAttemptsCount() {
        return playedAttempts.size();
    }

    public List<Attempt> getPlayedAttempts() {
        return playedAttempts;
    }


}
