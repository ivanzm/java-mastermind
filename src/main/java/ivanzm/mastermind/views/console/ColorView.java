package ivanzm.mastermind.views.console;

import ivanzm.mastermind.types.Color;
import ivanzm.utils.Console;

class ColorView extends ivanzm.mastermind.views.ColorView {

    ColorView(Color color) {
        super(color);
    }

    void write() {
        new Console().write(ColorView.INITIALS[this.color.ordinal()]);
    }

}
