package ikab.dev.mastermind;


import ikab.dev.mastermind.controllers.Logic;
import ikab.dev.mastermind.views.GraphicsView;
import ikab.dev.mastermind.views.View;

public class GraphicsMastermind extends Mastermind {

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

    @Override
    protected View createView(Logic logic) {
        return new GraphicsView(logic);
    }
}