package org.mars.rover;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private int x_axis;
    private int y_axis;
    char rover_direction;
    List<Character> movingSeq = Arrays.asList(new Character[]{'N', 'W', 'S', 'E'});

    public Rover(int x_axis, int y_axis, char direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.rover_direction = direction;
    }

    public String getPosition() {
        return x_axis + " " + y_axis + " "+rover_direction;
    }

    public char getDirectionFacing() {
        return rover_direction;
    }

    public char left() {
        int index = movingSeq.indexOf(rover_direction);
        return rover_direction = (index == (movingSeq.size() - 1)) ? movingSeq.get(0)
                : movingSeq.get(index + 1);
    }

    public char right() {
        int index = movingSeq.indexOf(rover_direction);
        return rover_direction = (index == 0) ? movingSeq.get(movingSeq.size() - 1)
                : movingSeq.get(index - 1);
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
        return x_axis + " " + y_axis + " " + rover_direction;
    }
}
