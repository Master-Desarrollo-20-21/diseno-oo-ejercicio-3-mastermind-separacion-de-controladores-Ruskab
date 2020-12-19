package ikab.dev.mastermind.controllers;

import ikab.dev.mastermind.models.Game;

public class StartController extends Controller {


    public StartController(Game game) {
        super(game);
    }

    public void initGame() {
        game.init();
    }
}
