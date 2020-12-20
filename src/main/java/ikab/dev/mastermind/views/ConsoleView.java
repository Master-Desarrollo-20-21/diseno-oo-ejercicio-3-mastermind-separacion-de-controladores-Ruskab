package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.Controller;
import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.views.console.GameView;
import ikab.dev.mastermind.views.console.ResumeView;
import ikab.dev.mastermind.views.console.StartView;

public class ConsoleView extends View {

    private final GameView gameView;
    private final ResumeView resumeView;
    private final StartView startView;

    public ConsoleView() {
        this.gameView = new GameView();
        this.resumeView = new ResumeView();
        this.startView = new StartView();
    }

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startView.start(startController);
    }

    @Override
    public void visit(ProposeCombinationController proposeCombinationController) {
        gameView.interact(proposeCombinationController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeView.interact(resumeController);
    }
}
