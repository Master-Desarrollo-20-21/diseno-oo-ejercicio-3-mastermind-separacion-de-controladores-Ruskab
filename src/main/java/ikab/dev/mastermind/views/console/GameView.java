package ikab.dev.mastermind.views.console;


import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.models.Attempt;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.Message;


public class GameView {

    private final ProposedCombinationView proposedCombinationView;
    private final Logic logic;

    public GameView(Logic logic) {
        this.proposedCombinationView = new ProposedCombinationView(logic);
        this.logic = logic;
    }

    public void interact() {
        do {
            Console.getInstance().writeln(String.format(Message.ATTEMPTS_COUNT.getMessage(), logic.getAttemptsCount()));
            Console.getInstance().writeln(Message.SECRET_COMBINATION_HIDDEN.getMessage());
            for (Attempt attempt : logic.getPlayedAttempts()) {
                Console.getInstance()
                        .writeln(String.format(Message.ATTEMPT.getMessage(), attempt.getProposedCombinationCode(), attempt.getBlacks(), attempt.getWhites()));
            }
            ProposedCombination proposedCombination = proposedCombinationView.readProposedCombination();
            logic.playCombination(proposedCombination);
        } while (logic.isContinuePlaying());
        if (logic.isWinnerGame()) {
            Console.getInstance().writeln(Message.WIN_MESSAGE.getMessage());
        } else {
            Console.getInstance().writeln(Message.LOST_MESSAGE.getMessage());
        }
    }

    public boolean isEndGame() {
        return !logic.isContinuePlaying();
    }
}
