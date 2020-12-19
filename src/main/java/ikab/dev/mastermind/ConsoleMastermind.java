package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.ProposeCombinationController;
import ikab.dev.mastermind.controllers.ResumeController;
import ikab.dev.mastermind.controllers.StartController;
import ikab.dev.mastermind.views.ConsoleView;
import ikab.dev.mastermind.views.View;

class ConsoleMastermind extends Mastermind {

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

    @Override
    protected View createView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
        return new ConsoleView(startController, resumeController, proposeCombinationController);
    }
}