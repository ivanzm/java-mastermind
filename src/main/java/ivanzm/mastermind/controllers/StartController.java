package ivanzm.mastermind.controllers;

import ivanzm.mastermind.models.Game;
import ivanzm.mastermind.models.State;

public class StartController extends Controller {

    public StartController(Game game, State state) {
        super(game, state);
    }

    public void start() {
        this.state.next();
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
