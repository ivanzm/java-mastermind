package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

enum Message {
    TITLE("----- MASTERMIND -----"),
    ATTEMPTS("attempts attempt(s): "),
    SECRET_COMBINATION("xxxx"),
    PROPOSED_COMBINATION("Propose a combination"),
    RESULT_BLACKS(" blacks and "),
    RESULT_WHITES(" whites"),
    RESUME("Do you want to continue playing? (y/n)"),
    LOOSER("You Lose .. :("),
    WINNER("You Win!");

    private String message;

    private Message(String message) {
        this.message = message;
    }

    static void write(String message) {
        Console.instance().write(message);
    }

    static void write(int message) {
        Console.instance().write(message);
    }

    static void writeln(String message) {
        Console.instance().writeln(message);
    }

    void write() {
        Console.instance().write(this.message);
    }

    void writeln() {
        Console.instance().writeln(this.message);
    }
}
