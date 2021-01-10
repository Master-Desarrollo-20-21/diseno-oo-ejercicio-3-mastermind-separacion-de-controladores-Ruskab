package ikab.dev.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class CombinationCode {

    private final String value;

    public CombinationCode(String value) {
        this.value = value;
    }

    public Error checkIfValidCombination() {
        if (this.value.isBlank()) {
            return Error.WRONG_PROPOSED_COMBINATION_LENGTH;
        }
        if (this.value.length() != ProposedCombination.COMBINATION_SIZE) {
            return Error.WRONG_PROPOSED_COMBINATION_LENGTH;
        }
        if (!isValidColors(this.value)) {
            return Error.WRONG_PROPOSED_COMBINATION_COLORS;
        }
        if (duplicateColors(this.value)) {
            return Error.DUPLICATE_PROPOSED_COMBINATION_COLORS;
        }
        return Error.NULL;
    }

    private boolean duplicateColors(String proposedCombinationCode) {
        List<Character> uniqueColors = new ArrayList<>();
        for (char colorCode : proposedCombinationCode.toCharArray()) {
            if (uniqueColors.contains(colorCode)) {
                return true;
            }
            uniqueColors.add(colorCode);
        }
        return false;
    }

    private boolean isValidColors(String proposedCombination) {
        for (char colorCode : proposedCombination.toCharArray()) {
            if (!Color.isValidColor(colorCode)) {
                return false;
            }
        }
        return true;
    }
}
