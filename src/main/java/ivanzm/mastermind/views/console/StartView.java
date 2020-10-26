package ivanzm.mastermind.views.console;

import ivanzm.mastermind.controllers.StartController;
import ivanzm.mastermind.views.MessageView;
import ivanzm.utils.WithConsoleView;

class StartView extends WithConsoleView {

    private SecretCombinationView secretCombinationView;

    void interact(StartController startController) {
        startController.start();
        this.console.writeln(MessageView.TITLE.getMessage());
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }

}
