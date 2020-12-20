package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.models.ProposedCombination;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.ErrorView;

import static ikab.dev.mastermind.views.Message.PROPOSE_COMBINATION;

public class ProposedCombinationView {

    public ProposedCombination readProposedCombination(ProposeCombinationController proposeCombinationController) {
        String proposedCombinationCode = "";
        Error error;
        do {
            proposedCombinationCode = Console.getInstance().readString(PROPOSE_COMBINATION.getMessage());
            Console.getInstance().writeln();
            Console.getInstance().writeln();
            error = proposeCombinationController.checkIfValidProposedCombination(proposedCombinationCode);
            ErrorView.of(error).writeln();

        } while (!error.isNull());
        return new ProposedCombination(proposedCombinationCode.toCharArray());
    }


}
