package org.mars.rover;

public class Plateau {

    private int x_axis;
    private int y_axis;

    private static Plateau plateau;
    private Plateau(int x, int y) {
        this.x_axis = x;
        this.y_axis = y;
    }

    public static synchronized Plateau getInstance(int x, int y) {
        if (plateau == null)
            plateau=new Plateau(x,y);
        return plateau;
    }


}
