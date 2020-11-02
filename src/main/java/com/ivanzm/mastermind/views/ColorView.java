package com.ivanzm.mastermind.views;

import com.ivanzm.mastermind.models.Color;
import com.ivanzm.utils.Console;

import java.util.Random;

class ColorView {

    private static final char[] INITIALS = {'r', 'g', 'y', 'o', 'p', 'b'};
    private Color color;
    private Color[] colors;

    ColorView(Color color) {
        this.color = color;
    }

    ColorView(Color[] colors) {
        this.colors = colors;
    }

    void print() {
        Console.instance().write(INITIALS[this.color.ordinal()]);
    }

    void println() {
        Console.instance().writeln(INITIALS[this.color.ordinal()]);
    }

    void printCombination() {
        for (Color color : colors) {
            new ColorView(color).print();
        }
    }

    public static String getInitials() {
        String result = "";
        for (char character : ColorView.INITIALS) {
            result += character;
        }
        return result;
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
