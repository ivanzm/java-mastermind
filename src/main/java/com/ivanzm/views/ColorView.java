package com.ivanzm.views;

import com.ivanzm.mastermind.Color;
import com.ivanzm.utils.Console;

import java.util.Random;

class ColorView {

    private static final char[] INITIALS = {'r', 'g', 'y', 'o', 'p', 'b'};
    private Color color;

    ColorView(Color color) {
        this.color = color;
    }

    void print() {
        Console.instance().write(INITIALS[this.color.ordinal()]);
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
            if (INITIALS[i] == character) {
                return Color.values()[i];
            }
        }
        return null;
    }

    static Color random() {
        int random = new Random().nextInt(Color.values().length);
        return Color.values()[random];
    }
}
