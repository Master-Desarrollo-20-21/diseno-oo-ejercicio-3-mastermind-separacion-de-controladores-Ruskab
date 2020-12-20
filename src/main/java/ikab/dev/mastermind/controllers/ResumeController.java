package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void reset() {
        this.state.reset();
    }

    public void finish() {
        super.next();
    }
}
