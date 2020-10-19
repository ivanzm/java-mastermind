package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

enum Error {
    LENGTH("Wrong proposed combination length"),
    COLOR("Wrong colors, they must be: rbygop"),
    DUPLICATE("Wrong colors, repeated color");

    private String message;

    private Error(String message) {
        this.message = message;
    }

    void writeln() {
        Console.instance().writeln(this.message);
    }
}
