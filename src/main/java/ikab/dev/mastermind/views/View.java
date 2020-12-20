package ikab.dev.mastermind.views;

import ikab.dev.mastermind.controllers.Controller;
import ikab.dev.mastermind.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public abstract void interact(Controller controller);

}
