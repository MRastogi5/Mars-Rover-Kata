package org.mars.rover;

import java.util.Arrays;
import java.util.List;

public class Rover {
    private int x;
    private int y;
    char rover_direction;
    List<Character> movingDirectionLeft = Arrays.asList(new Character[]{'N', 'W', 'S', 'E'});
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

    public char turnLeft() {

         int index = movingDirectionLeft.indexOf(rover_direction);
         if(index==(movingDirectionLeft.size()-1)){
             return rover_direction = movingDirectionLeft.get(0);
         }
         else {
             return rover_direction = movingDirectionLeft.get(index+1);
        }
    }

    public char turnRight() {
        int index = movingDirectionLeft.indexOf(rover_direction);
        if(index==0){
            return rover_direction = movingDirectionLeft.get(movingDirectionLeft.size()-1);
        }
        else {
            return rover_direction = movingDirectionLeft.get(index-1);
        }
    }

    public String move() {
        return "";
    }
}
