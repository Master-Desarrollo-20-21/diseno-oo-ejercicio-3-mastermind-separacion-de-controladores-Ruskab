package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.CombinationCode;
import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.models.State;

import java.util.List;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public int getAttemptsCount() {
        return game.getAttemptsCount();
    }

    public List<Attempt> getPlayedAttempts() {
        return game.getPlayedAttempts();
    }

    public Error checkIfValidProposedCombination(String proposedCombinationCode) {
        return new CombinationCode(proposedCombinationCode).checkIfValidCombination();
    }

    public void playCombination(ProposedCombination proposedCombination) {
        game.playCombination(proposedCombination);
    }

    public boolean isContinuePlaying() {
        return game.isContinuePlaying();
    }

    public boolean isWinnerGame() {
        return game.isWinnerGame();
    }


}
