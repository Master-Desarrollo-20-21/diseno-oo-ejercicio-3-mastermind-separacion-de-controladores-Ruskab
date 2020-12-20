package ikab.dev.mastermind;


import ikab.dev.mastermind.views.ConsoleView;
import ikab.dev.mastermind.views.View;

class ConsoleMastermind extends Mastermind {

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }

    @Override
    protected View createView() {
        return new ConsoleView();
    }
}