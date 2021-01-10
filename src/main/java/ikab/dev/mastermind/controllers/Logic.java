package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.State;
import ikab.dev.mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final Map<StateValue, Controller> controllers;
    private final Game game;
    private final State state;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME, new ProposeCombinationController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }

    public boolean isExit() {
        return state.isExit();
    }

}
