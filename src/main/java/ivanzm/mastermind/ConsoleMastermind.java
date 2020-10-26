package ivanzm.mastermind;

import ivanzm.mastermind.views.View;
import ivanzm.mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
