package ikab.dev.mastermind.views;

import ikab.dev.mastermind.models.Error;
import ikab.dev.mastermind.utils.Console;

public class ErrorView {

    protected Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public static ErrorView of(Error error) {
        return new ErrorView(error);
    }

    public void writeln() {
        if (!error.getMessage().isBlank()) {
            Console.getInstance().writeln(error.getMessage());
        }
    }
}
