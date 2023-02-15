package org.mars.rover;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private int x_axis;
    private int y_axis;
    char rover_direction;
    List<Character> movingDirectionLeft = Arrays.asList(new Character[]{'N', 'W', 'S', 'E'});

    public Rover(int x_axis, int y_axis, char direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.rover_direction = direction;
    }

    public String getPosition() {
        return x_axis + " " + y_axis;
    }

    public char getDirectionFacing() {
        return rover_direction;
    }

    public char turnLeft() {

        int index = movingDirectionLeft.indexOf(rover_direction);
        if (index == (movingDirectionLeft.size() - 1)) {
            return rover_direction = movingDirectionLeft.get(0);
        } else {
            return rover_direction = movingDirectionLeft.get(index + 1);
        }
    }

    public char turnRight() {
        int index = movingDirectionLeft.indexOf(rover_direction);
        if (index == 0) {
            return rover_direction = movingDirectionLeft.get(movingDirectionLeft.size() - 1);
        } else {
            return rover_direction = movingDirectionLeft.get(index - 1);
        }
    }

    public String move() {

        switch (rover_direction) {
            case 'N':
                ++y_axis;
                break;
            case 'E':
                ++x_axis;
                break;

            case 'S':
                --y_axis;
                break;
            case 'W':
                --x_axis;
                break;
        }
        return x_axis +" "+ y_axis +" "+ rover_direction;
    }
}
