package com.ivanzm.mastermind.views;


import com.ivanzm.mastermind.models.Error;
import com.ivanzm.utils.Console;

public class ErrorView {
    private static final String[] MESSAGES = {
            "Wrong proposed combination length",
            "Wrong colors, they must be: " + ColorView.getInitials(),
            "Wrong colors, repeated color"};


    private Error error;

    ErrorView(Error error) {
        this.error = error;
    }

    void writeln() {
        Console.instance().writeln(MESSAGES[this.error.ordinal()]);
    }

}
