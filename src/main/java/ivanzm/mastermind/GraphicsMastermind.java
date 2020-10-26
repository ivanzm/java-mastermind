package ivanzm.mastermind;

import ivanzm.mastermind.views.View;
import ivanzm.mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }
}
