package com.ivanzm.mastermind;

import com.ivanzm.utils.Console;

import java.util.Random;

enum Color {
    RED('r'),
    GREEN('g'),
    YELLOW('y'),
    ORANGE('o'),
    PURPLE('p'),
    BLUE('b');


    private char initial;

    private Color(char initial) {
        this.initial = initial;
    }

    static Color get(int index) {
        return Color.values()[index];
    }

    void print() {
        Console.instance().write(initial);
    }

    static boolean contains(Color color) {
        for (Color c : Color.values()) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false;
    }

    static Color getInstance(char character) {
        for (int i = 0; i < Color.values().length; i++) {
            if (Color.get(i).initial == character) {
                return Color.get(i);
            }
        }
        return null;
    }

    static Color random() {
        int random = new Random().nextInt(Color.values().length);
        return Color.values()[random];
    }
}
