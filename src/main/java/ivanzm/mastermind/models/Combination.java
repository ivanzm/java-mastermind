package ivanzm.mastermind.models;

import ivanzm.mastermind.types.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

    private static final int WIDTH = 4;

    protected List<Color> colors;

    protected Combination() {
        this.colors = new ArrayList<Color>();
    }

    public static int getWidth() {
        return Combination.WIDTH;
    }

}
