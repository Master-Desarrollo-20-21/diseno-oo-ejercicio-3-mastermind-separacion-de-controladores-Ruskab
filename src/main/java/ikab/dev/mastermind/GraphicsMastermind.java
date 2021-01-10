package ikab.dev.mastermind;


import ikab.dev.mastermind.views.graphics.GraphicsView;
import ikab.dev.mastermind.views.View;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }
}