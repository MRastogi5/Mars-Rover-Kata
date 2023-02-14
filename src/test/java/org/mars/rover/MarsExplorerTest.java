package org.mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsExplorerTest {

    @Test
    public void testExploreMars(){
        MarsExplorer explorer = new MarsExplorer();
        assertNotNull(explorer);
        //assertEquals(0, explorer.moveRover());
    }



}
