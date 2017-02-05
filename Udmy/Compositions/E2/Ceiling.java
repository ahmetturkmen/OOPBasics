package Composition.E1.e2;

/**
 * Created by ahmetturkmen on 2/5/17.
 */
public class Ceiling {
    private int height;

    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
