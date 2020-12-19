package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.views.GraphicsView;
import ikab.dev.mastermind.views.View;

public class GraphicsMastermind extends Mastermind {

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

    @Override
    protected View createView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
        return new GraphicsView(startController, resumeController, proposeCombinationController);
    }
}