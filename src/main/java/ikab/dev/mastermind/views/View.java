package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;

public abstract class View {

    protected StartController startController;
    protected ResumeController resumeController;
    protected ProposeCombinationController proposeCombinationController;

    public View(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
        this.startController = startController;
        this.resumeController = resumeController;
        this.proposeCombinationController = proposeCombinationController;
    }

    public void interact() {
        do {
            this.start();
            do {
                this.play();
            } while (!this.isEndGame());
        } while (this.isResume());
    }

    protected abstract void start();

    protected abstract void play();

    protected abstract boolean isEndGame();

    protected abstract boolean isResume();
}
