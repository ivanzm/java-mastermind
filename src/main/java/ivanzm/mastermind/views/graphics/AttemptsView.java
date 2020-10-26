package ivanzm.mastermind.views.graphics;

import ivanzm.mastermind.views.MessageView;

import javax.swing.*;

@SuppressWarnings("serial")
class AttemptsView extends JLabel {

    AttemptsView(int attempts) {
        this.setText(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + (attempts)));
    }

}
