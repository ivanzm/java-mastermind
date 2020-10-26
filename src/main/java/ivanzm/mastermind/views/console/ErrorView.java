package ivanzm.mastermind.views.console;

import ivanzm.mastermind.types.Error;
import ivanzm.utils.Console;

class ErrorView extends ivanzm.mastermind.views.ErrorView {

    ErrorView(Error error) {
        super(error);
    }

    void writeln() {
        new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}
