package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.Color;
import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.models.State;

import java.util.ArrayList;
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

    public void playCombination(ProposedCombination proposedCombination) {
        game.playCombination(proposedCombination);
    }

    public boolean isContinuePlaying() {
        return game.isContinuePlaying();
    }

    public boolean isWinnerGame() {
        return game.isWinnerGame();
    }

    public Error checkIfValidProposedCombination(String proposedCombinationCode) {
        if (proposedCombinationCode.isBlank()) {
            return Error.WRONG_PROPOSED_COMBINATION_LENGTH;
        }
        if (proposedCombinationCode.length() != ProposedCombination.COMBINATION_SIZE) {
            return Error.WRONG_PROPOSED_COMBINATION_LENGTH;
        }
        if (!isValidColors(proposedCombinationCode)) {
            return Error.WRONG_PROPOSED_COMBINATION_COLORS;
        }
        if (duplicateColors(proposedCombinationCode)) {
            return Error.DUPLICATE_PROPOSED_COMBINATION_COLORS;
        }
        return Error.NULL;
    }

    private boolean duplicateColors(String proposedCombinationCode) {
        List<Character> uniqueColors = new ArrayList<>();
        for (char colorCode : proposedCombinationCode.toCharArray()) {
            if (uniqueColors.contains(colorCode)) {
                return true;
            }
            uniqueColors.add(colorCode);
        }
        return false;
    }

    private boolean isValidColors(String proposedCombination) {
        for (char colorCode : proposedCombination.toCharArray()) {
            if (!Color.isValidColor(colorCode)) {
                return false;
            }
        }
        return true;
    }

    public void finish() {
        super.next();
    }
}
