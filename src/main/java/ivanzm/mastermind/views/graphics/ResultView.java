package ivanzm.mastermind.views.graphics;

import ivanzm.mastermind.views.MessageView;
import ivanzm.mastermind.controllers.ProposalController;

import javax.swing.*;

@SuppressWarnings("serial")
class ResultView extends JLabel {

    private ProposalController proposalController;

    ResultView(ProposalController proposalController) {
        this.proposalController = proposalController;
        this.setText(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.proposalController.getBlacks(this.proposalController.getAttempts() - 1))
                .replaceFirst("#whites", "" + this.proposalController.getWhites(this.proposalController.getAttempts() - 1)));
    }

}
