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
        assertEquals("0 0 N",rover.getPosition());
    }

    @Test
    public void testGetRoverDirectionFacing(){
        Rover rover = new Rover(0,0,'N');
        assertEquals('N', rover.getDirectionFacing());
    }

    @Test
    public void testTurnLeft(){
        Rover rover = new Rover(5,5,'N');
        assertEquals('W', rover.left());
    }

    @Test
    public void testTurnRight(){
        Rover rover = new Rover(5,5,'N');
        assertEquals('E', rover.right());
    }

    @Test
    public void testMoveRoverOneStepNorth(){
        Rover rover = new Rover(3,2,'N');
        assertEquals("3 3 N", rover.move(6, 6));
    }

    @Test
    public void testMoveRoverOneStepSouth(){
        Rover rover = new Rover(3,2,'S');
        assertEquals("3 1 S", rover.move(6, 6));
    }
    @Test
    public void testMoveRoverOneStepEast(){
        Rover rover = new Rover(3,2,'E');
        assertEquals("4 2 E", rover.move(7, 7));
    }
    @Test
    public void testMoveRoverOneStepWest(){
        Rover rover = new Rover(3,2,'W');
        assertEquals("2 2 W", rover.move(7, 7));
    }

    @Test
    public void testMoveRoverOneStepWestBeyond(){
        Rover rover = new Rover(3,2,'W');
        assertEquals("2 2 W", rover.move(3, 3));
        assertEquals("1 2 W", rover.move(3, 3));
        assertEquals("0 2 W", rover.move(3, 3));
        assertEquals("0 2 W", rover.move(3, 3));
    }
}
