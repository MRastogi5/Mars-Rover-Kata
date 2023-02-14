package org.mars.rover;

public class Rover {
    private int x;
    private int y;
    char rover_direction;
    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.rover_direction = direction;

    }

    public String getPosition() {
        return x +" "+y;
    }

    public char getDirectionFacing() {
        return rover_direction;
    }
}
