package ikab.dev.mastermind.views.console;

import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.utils.Console;

import static ikab.dev.mastermind.views.Message.TITLE;

public class StartView {

    private final Logic logic;

    public StartView(Logic logic) {
        this.logic = logic;
    }

    public void start() {
        logic.initGame();
        Console.getInstance().write(TITLE.getMessage());
    }
}
