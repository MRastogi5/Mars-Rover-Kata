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
}
