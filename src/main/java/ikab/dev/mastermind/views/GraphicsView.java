package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;

public class GraphicsView extends View {


    public GraphicsView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
        super(startController, resumeController, proposeCombinationController);
    }

    @Override
    protected void start() {

    }

    @Override
    protected void play() {

    }

    @Override
    protected boolean isEndGame() {
        return false;
    }

    @Override
    protected boolean isResume() {
        return false;
    }
}
