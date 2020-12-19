package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.Logic;

public abstract class View {

    protected Logic logic;


    public View(Logic logic) {
        this.logic = logic;
    }

    public void interact() {
        do {
            this.start();
            do {
                this.play();
            } while (!this.isEndGame());
        } while (this.isResume());
    }

    protected abstract void start();

    protected abstract void play();

    protected abstract boolean isEndGame();

    protected abstract boolean isResume();
}
