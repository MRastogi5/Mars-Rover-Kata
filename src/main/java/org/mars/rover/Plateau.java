package org.mars.rover;

public class Plateau {

    private int x_axis;
    private int y_axis;

    private Plateau grid;
    public Plateau(int x, int y) {
        this.x_axis = x;
        this.y_axis = y;
    }

    public Plateau getGrid() {

        return grid;
    }
}
