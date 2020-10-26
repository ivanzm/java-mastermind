package ivanzm.mastermind.views.console;

import ivanzm.mastermind.controllers.ResumeController;
import ivanzm.mastermind.views.MessageView;
import ivanzm.utils.YesNoDialog;

class ResumeView {

    void interact(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
    }

}
