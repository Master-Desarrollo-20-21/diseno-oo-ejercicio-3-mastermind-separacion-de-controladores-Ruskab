package ikab.dev.mastermind.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecretCombination extends Combination {

    public SecretCombination() {
        this.setColors(getRandomColors());
    }

    private List<Color> getRandomColors() {
        List<Color> colors = Arrays.asList(Color.values());
        Collections.shuffle(colors);
        return colors.subList(0, COMBINATION_SIZE);
    }

    public boolean isCorrectCombination(Combination proposedCombination) {
        return this.getColors().equals(proposedCombination.getColors());
    }

    public int getWhites(Combination proposedCombination) {
        int whites = 0;
        for (int i = 0; i < this.getColors().size(); i++) {
            if (this.getColors().get(i).equals(proposedCombination.getColors().get(i))) {
                whites++;
            }
        }
        return whites;
    }

    public int getBlacks(Combination proposedCombination) {
        int blacks = 0;
        for (Color color : proposedCombination.getColors()) {
            if (this.getColors().contains(color)) {
                blacks++;
            }
        }
        return blacks;
    }

}
