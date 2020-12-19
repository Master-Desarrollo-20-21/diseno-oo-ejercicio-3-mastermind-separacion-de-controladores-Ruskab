package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.ProposedCombination;

import java.util.List;

public class Logic {

    private final StartController startController;
    private final ResumeController resumeController;
    private final ProposeCombinationController proposeCombinationController;
    private final Game game;

    public Logic() {
        this.game = new Game();
        this.startController = new StartController(game);
        this.resumeController = new ResumeController(game);
        this.proposeCombinationController = new ProposeCombinationController(game);
    }

    public int getAttemptsCount() {
        return proposeCombinationController.getAttemptsCount();
    }

    public List<Attempt> getPlayedAttempts() {
        return proposeCombinationController.getPlayedAttempts();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        proposeCombinationController.playCombination(proposedCombination);
    }

    public boolean isContinuePlaying() {
        return proposeCombinationController.isContinuePlaying();
    }

    public boolean isWinnerGame() {
        return proposeCombinationController.isWinnerGame();
    }

    public Error checkIfValidProposedCombination(String proposedCombinationCode) {
        return this.proposeCombinationController.checkIfValidProposedCombination(proposedCombinationCode);
    }

    public void initGame() {
        startController.initGame();
    }




}
