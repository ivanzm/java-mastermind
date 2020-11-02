package com.ivanzm.mastermind.views;

import com.ivanzm.mastermind.models.Result;

public class ResultView {

    private Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        MessageView.write(" --> ");
        MessageView.write(result.getBlacks());
        MessageView.RESULT_BLACKS.write();
        MessageView.write(result.getWhites());
        MessageView.RESULT_WHITES.write();
        MessageView.writeln("");
    }
}
