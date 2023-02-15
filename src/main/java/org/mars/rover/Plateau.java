package org.mars.rover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    private int x_axis;
    private int y_axis;

    public List<Rover> getRovers() {
        return rovers;
    }

    public void setRovers(List<Rover> rovers) {
        this.rovers = rovers;
    }

    public void addRover(Rover rover) {
        rovers.add(rover);
    }

    private List<Rover> rovers = new ArrayList<>();

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
