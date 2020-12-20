package ikab.dev.mastermind.views.console;


import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.Message;


public class GameView {

    private final ProposedCombinationView proposedCombinationView;

    public GameView() {
        this.proposedCombinationView = new ProposedCombinationView();
    }

    public void interact(ProposeCombinationController proposeCombinationController) {
        do {
            Console.getInstance().writeln(String.format(Message.ATTEMPTS_COUNT.getMessage(), proposeCombinationController.getAttemptsCount()));
            Console.getInstance().writeln(Message.SECRET_COMBINATION_HIDDEN.getMessage());
            for (Attempt attempt : proposeCombinationController.getPlayedAttempts()) {
                Console.getInstance()
                        .writeln(String.format(Message.ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getBlacks(), attempt.getWhites()));
            }
            ProposedCombination proposedCombination = proposedCombinationView.readProposedCombination(proposeCombinationController);
            proposeCombinationController.playCombination(proposedCombination);
        } while (proposeCombinationController.isContinuePlaying());
        proposeCombinationController.finish();
        if (proposeCombinationController.isWinnerGame()) {
            Console.getInstance().writeln(Message.WIN_MESSAGE.getMessage());
        } else {
            Console.getInstance().writeln(Message.LOST_MESSAGE.getMessage());
        }
    }
}
