package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.views.View;

public abstract class Mastermind {

    private final Game game;
    private final View view;
    private final StartController startController;
    private final ResumeController resumeController;
    private final ProposeCombinationController proposeCombinationController;

    protected Mastermind() {
        this.game = new Game();
        this.startController = new StartController(game);
        this.resumeController = new ResumeController(game);
        this.proposeCombinationController = new ProposeCombinationController(game);
        this.view = this.createView(startController, resumeController, proposeCombinationController);
    }

    protected abstract View createView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController);

    protected void play() {
        this.view.interact();
    }
}
