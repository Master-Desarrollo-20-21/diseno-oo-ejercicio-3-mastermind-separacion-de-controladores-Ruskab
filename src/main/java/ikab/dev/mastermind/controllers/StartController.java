package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Game;
import ikab.dev.mastermind.models.State;

public class StartController extends Controller {

    public StartController(Game game, State state) {
        super(game, state);
    }

    public void initGame() {
        game.init();
    }
}
