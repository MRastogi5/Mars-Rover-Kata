package org.mars.rover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
public class RoverTest {

    @Test
    public void testCreateRover(){
        Rover rover = new Rover(0,0,'N');
        assertNotNull(rover);
    }

    @Test
    public void testGetRoverPosition(){
        Rover rover = new Rover(0,0,'N');
        assertEquals("0 0",rover.getPosition());
    }

    @Test
    public void testGetRoverDirectionFacing(){
        Rover rover = new Rover(0,0,'N');
        assertEquals('N', rover.getDirectionFacing());
    }

    @Test
    public void testTurnLeft(){
        Rover rover = new Rover(5,5,'N');
        //System.out.println("Left turn N : ");
        //System.out.print(rover.turnLeft());
        //System.out.print(rover.turnLeft());
        //System.out.print(rover.turnLeft());
        //System.out.print(rover.turnLeft());
        //System.out.print(rover.turnLeft());
        assertEquals('W', rover.turnLeft());
    }

    @Test
    public void testTurnRight(){
        Rover rover = new Rover(5,5,'N');
        //System.out.print("Right turn N : ");
        //System.out.print(rover.turnRight());
        //System.out.print(rover.turnRight());
        //System.out.print(rover.turnRight());
        //System.out.print(rover.turnRight());
        //System.out.print(rover.turnRight());
        assertEquals('E', rover.turnRight());
    }

    @Test
    public void testMoveRoverOneStepNorth(){
        Rover rover = new Rover(3,2,'N');
        assertEquals("3 3 N", rover.move());
    }

    @Test
    public void testMoveRoverOneStepSouth(){
        Rover rover = new Rover(3,2,'S');
        assertEquals("3 1 S", rover.move());
    }
    @Test
    public void testMoveRoverOneStepEast(){
        Rover rover = new Rover(3,2,'E');
        assertEquals("4 2 E", rover.move());
    }
    @Test
    public void testMoveRoverOneStepWest(){
        Rover rover = new Rover(3,2,'W');
        assertEquals("2 2 W", rover.move());
    }
}
