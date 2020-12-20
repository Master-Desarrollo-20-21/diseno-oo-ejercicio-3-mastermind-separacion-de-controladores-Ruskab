package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.views.View;

public abstract class Mastermind {

    private final View view;
    private final Logic logic;

    protected Mastermind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract View createView();

    protected void play() {
        do {
            this.view.interact(this.logic.getController());
        } while (!this.logic.isExit());
    }
}
