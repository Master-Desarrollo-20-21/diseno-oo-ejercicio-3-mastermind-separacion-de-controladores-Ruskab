package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.ErrorView;

import static ikab.dev.mastermind.views.Message.PROPOSE_COMBINATION;

public class ProposedCombinationView {

    private final Logic logic;

    public ProposedCombinationView(Logic logic) {
        this.logic = logic;
    }

    public ProposedCombination readProposedCombination() {
        String proposedCombinationCode = "";
        Error error;
        do {
            proposedCombinationCode = Console.getInstance().readString(PROPOSE_COMBINATION.getMessage());
            Console.getInstance().writeln();
            Console.getInstance().writeln();
            error = logic.checkIfValidProposedCombination(proposedCombinationCode);
            ErrorView.of(error).writeln();

        } while (!error.isNull());
        return new ProposedCombination(proposedCombinationCode.toCharArray());
    }


}
