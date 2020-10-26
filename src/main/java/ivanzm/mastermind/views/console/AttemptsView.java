package ivanzm.mastermind.views.console;

import ivanzm.mastermind.controllers.ProposalController;
import ivanzm.mastermind.views.MessageView;
import ivanzm.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private ProposalController proposalController;

    AttemptsView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln() {
        this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
                "" + this.proposalController.getAttempts()));
    }

}
