package org.mars.rover;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
public class RoverTest {

    @Test
    public void testCreateRover(){
        Rover rover = new Rover(0,0,'N');
        assertNotNull(rover);
    }
}
