package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.RESUME;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        if (isResume()) {
            resumeController.reset();
        } else {
            resumeController.next();
        }
    }

    public boolean isResume() {
        char input;
        do {
            input = Console.getInstance().readChar(RESUME.getMessage());
        } while (!isValidInput(input));
        return 'y' == input;
    }

    private boolean isValidInput(char input) {
        return 'y' == input || 'n' == input;
    }


}
