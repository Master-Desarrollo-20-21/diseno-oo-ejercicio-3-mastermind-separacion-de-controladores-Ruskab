package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.views.console.GameView;
import ikab.dev.mastermind.views.console.ResumeView;
import ikab.dev.mastermind.views.console.StartView;

public class ConsoleView extends View {

    private final GameView gameView;
    private final ResumeView resumeView;
    private final StartView startView;

    public ConsoleView(Logic logic) {
        super(logic);
        this.startView = new StartView(logic);
        this.resumeView = new ResumeView(logic);
        this.gameView = new GameView(logic);
    }

    @Override
    protected void start() {
        this.startView.start();
    }

    @Override
    protected void play() {
        gameView.interact();
    }

    @Override
    protected boolean isEndGame() {
        return gameView.isEndGame();
    }

    @Override
    protected boolean isResume() {
        return resumeView.isResume();
    }
}
