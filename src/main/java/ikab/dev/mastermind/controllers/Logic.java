package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.State;
import ikab.dev.mastermind.models.StateValue;

import java.util.Map;

import static ikab.dev.mastermind.models.StateValue.EXIT;

public class Logic {

    private final Map<StateValue, Controller> controllers;
    private final Game game;
    private final State state;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = Map.of(
                StateValue.INITIAL, new StartController(this.game, this.state),
                StateValue.IN_GAME, new ProposeCombinationController(game, this.state),
                StateValue.RESUME, new ResumeController(game, this.state),
                EXIT, new ExitController(game, this.state)
        );
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }

    public boolean isExit() {
        return EXIT.equals(this.state.getValueState());
    }

}
