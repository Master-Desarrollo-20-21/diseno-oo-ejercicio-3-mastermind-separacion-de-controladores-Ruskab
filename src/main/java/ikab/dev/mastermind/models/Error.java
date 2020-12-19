package ikab.dev.mastermind.models;

public enum Error {
    WRONG_PROPOSED_COMBINATION_LENGTH("Wrong proposed combination length"),
    WRONG_PROPOSED_COMBINATION_COLORS("Wrong colors, they must be: rbygop"),
    DUPLICATE_PROPOSED_COMBINATION_COLORS("Duplicate colors"),
    NULL("");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isNull() {
        return this == Error.NULL;
    }
}