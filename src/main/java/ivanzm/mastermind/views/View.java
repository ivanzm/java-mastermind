package ivanzm.mastermind.views;

import ivanzm.mastermind.controllers.Controller;
import ivanzm.mastermind.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

    public void interact(Controller controller) {
        controller.accept(this);
    }

}
