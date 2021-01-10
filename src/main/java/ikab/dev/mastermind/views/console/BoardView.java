package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.ATTEMPT;
import static ikab.dev.mastermind.views.Message.ATTEMPTS_COUNT;
import static ikab.dev.mastermind.views.Message.SECRET_COMBINATION_HIDDEN;

public class BoardView {

    public void interact(ProposeCombinationController proposeCombinationController) {
        Console.getInstance().writeln(String.format(ATTEMPTS_COUNT.getMessage(), proposeCombinationController.getAttemptsCount()));
        Console.getInstance().writeln(SECRET_COMBINATION_HIDDEN.getMessage());
        for (Attempt attempt : proposeCombinationController.getPlayedAttempts()) {
            Console.getInstance().writeln(String.format(ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getBlacks(), attempt.getWhites()));
        }
    }
}
