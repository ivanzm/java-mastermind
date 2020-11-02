package com.ivanzm.views;


import com.ivanzm.mastermind.Error;
import com.ivanzm.utils.Console;

public class ErrorView {
    private static final String[] MESSAGES = {
            "Wrong proposed combination length",
            "Wrong colors, they must be: rbygop",
            "Wrong colors, repeated color"};


    private Error error;

    ErrorView(Error error) {
        this.error = error;
    }

    void writeln() {
        Console.instance().writeln(MESSAGES[this.error.ordinal()]);
    }

}
