package ikab.dev.mastermind;


import ikab.dev.mastermind.views.GraphicsView;
import ikab.dev.mastermind.views.View;

public class GraphicsMastermind extends Mastermind {

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

    @Override
    protected View createView() {
        return new GraphicsView();
    }
}