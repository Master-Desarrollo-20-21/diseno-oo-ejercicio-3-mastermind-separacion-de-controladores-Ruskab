package ikab.dev.mastermind.views;

public enum Message {
    TITLE("----- MASTERMIND -----"),
    ATTEMPTS_COUNT("%s attempt(s):"),
    SECRET_COMBINATION_HIDDEN("xxxx"),
    PROPOSE_COMBINATION("Propose a combination: "),
    ATTEMPT("%s --> %s blacks and %s whites"),
    WIN_MESSAGE("You've won!!! ;-)"),
    LOST_MESSAGE("You've lost!!! :-("),
    RESUME("RESUME? (y/n): ");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}