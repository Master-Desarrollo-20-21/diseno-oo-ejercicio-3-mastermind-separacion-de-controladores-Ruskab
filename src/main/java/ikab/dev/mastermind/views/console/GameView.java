package ikab.dev.mastermind.views.console;


import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.LOST_MESSAGE;
import static ikab.dev.mastermind.views.Message.WIN_MESSAGE;


public class GameView {

    private final ProposedCombinationView proposedCombinationView;
    private final BoardView boardView;

    public GameView() {
        this.proposedCombinationView = new ProposedCombinationView();
        this.boardView = new BoardView();
    }

    public void interact(ProposeCombinationController proposeCombinationController) {
        do {
            boardView.interact(proposeCombinationController);
            ProposedCombination proposedCombination = proposedCombinationView.readProposedCombination(proposeCombinationController);
            proposeCombinationController.playCombination(proposedCombination);
        } while (proposeCombinationController.isContinuePlaying());
        proposeCombinationController.next();
        if (proposeCombinationController.isWinnerGame()) {
            Console.getInstance().writeln(WIN_MESSAGE.getMessage());
        } else {
            Console.getInstance().writeln(LOST_MESSAGE.getMessage());
        }
    }
}
