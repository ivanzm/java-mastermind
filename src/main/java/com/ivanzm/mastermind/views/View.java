package com.ivanzm.mastermind.views;

import com.ivanzm.mastermind.models.Game;

public class View {

    private Game game;
    private StartView startView;
    private TurnView turnView;
    private ResumeView resumeView;

    public View(Game game) {
        this.game = game;
        this.startView = new StartView();
        this.turnView = new TurnView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void interact() {
        boolean resumeGame;
        do {
            this.startView.interact();
            boolean isFinished;
            do {
                isFinished = this.turnView.interact();
            } while (!isFinished);
            resumeGame = this.resumeView.interact();
        } while (resumeGame);
    }

}
