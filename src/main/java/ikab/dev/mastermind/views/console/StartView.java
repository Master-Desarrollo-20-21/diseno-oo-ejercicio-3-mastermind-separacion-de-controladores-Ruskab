package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.TITLE;

public class StartView {

    public void interact(StartController startController) {
        Console.getInstance().write(TITLE.getMessage());
        startController.next();
    }
}
