package org.mars.rover;

import org.junit.jupiter.api.Test;
import org.mars.plataeu.Plateau;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsExplorerTest {

    @Test
    public void testCreatePlateau(){
        MarsExplorer explorer = new MarsExplorer();
        assertNotNull(explorer.createPlateau(6 ,6));

    }
    @Test
    public void testCreateRovers(){
        MarsExplorer explorer = new MarsExplorer();
        assertNotNull(explorer.createRover(1,2,'N'));
    }

    @Test
    public void testAddRoversToPlateau(){
        MarsExplorer explorer = new MarsExplorer();
        Plateau plateau = Plateau.getInstance(6 ,6);
        explorer.addRoverToPlateau(2, new int[]{1,2}, new int[]{1,2}, new char[]{1,2}, plateau );
        assertEquals(2,plateau.getRovers().size());
    }

    @Test
    public void testMoveRover(){
        MarsExplorer explorer = new MarsExplorer();
        //explorer.moveTheRover("NMNMNMNM", new Rover(1,2 , 'N'));
        //assertNotNull(explorer.plateau.getRovers().get(0).getPosition());
    }



}
