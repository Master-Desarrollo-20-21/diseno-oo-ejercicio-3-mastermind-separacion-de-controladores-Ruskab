package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.Message;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        if (isResume()) {
            resumeController.reset();
        } else {
            resumeController.finish();
        }
    }

    public boolean isResume() {
        char input;
        do {
            input = Console.getInstance().readChar(Message.RESUME.getMessage());
        } while (!isValidInput(input));
        return 'y' == input;
    }

    private boolean isValidInput(char input) {
        return 'y' == input || 'n' == input;
    }


}