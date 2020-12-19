package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.TITLE;

public class StartView {

    private final StartController startController;

    public StartView(StartController startController) {
        this.startController = startController;
    }

    public void start() {
        startController.initGame();
        Console.getInstance().write(TITLE.getMessage());
    }
}
