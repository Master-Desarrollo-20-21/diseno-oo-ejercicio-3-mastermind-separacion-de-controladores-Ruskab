package ikab.dev.mastermind;


import ikab.dev.mastermind.views.console.ConsoleView;
import ikab.dev.mastermind.views.View;

class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}