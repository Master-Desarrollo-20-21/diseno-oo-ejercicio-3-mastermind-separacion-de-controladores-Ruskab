package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.views.View;

public abstract class Mastermind {

    private final Game game;
    private final View view;
    private final Logic logic;

    protected Mastermind() {
        this.game = new Game();
        this.logic = new Logic();
        this.view = this.createView(logic);
    }

    protected abstract View createView(Logic logic);

    protected void play() {
        this.view.interact();
    }
}
