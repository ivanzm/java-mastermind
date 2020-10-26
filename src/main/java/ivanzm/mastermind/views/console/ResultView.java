package ivanzm.mastermind.views.console;

import ivanzm.mastermind.controllers.ProposalController;
import ivanzm.mastermind.views.MessageView;
import ivanzm.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private ProposalController proposalController;

    ResultView(ProposalController proposalController) {
        this.proposalController = proposalController;
    }

    void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.proposalController.getBlacks(i))
                .replaceFirst("#whites", "" + this.proposalController.getWhites(i)));
    }

}
