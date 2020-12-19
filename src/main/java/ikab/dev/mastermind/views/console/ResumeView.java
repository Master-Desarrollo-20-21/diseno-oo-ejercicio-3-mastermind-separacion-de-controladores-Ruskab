package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.utils.Console;
import ikab.dev.mastermind.views.Message;

public class ResumeView {

    ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
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
