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
    public void testMoveRoverOneStep(){
        Rover rover = new Rover(3,2,'N');
        //assertEquals('E', rover.move());
    }
}
