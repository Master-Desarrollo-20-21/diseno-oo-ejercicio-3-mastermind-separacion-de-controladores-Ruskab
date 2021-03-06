package ikab.dev.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

    protected static final int COMBINATION_SIZE = 4;

    protected List<Color> colors = new ArrayList<>();

    protected List<Color> getColors() {
        return colors;
    }

    protected void setColors(List<Color> colors) {
        this.colors = colors;
    }
}
