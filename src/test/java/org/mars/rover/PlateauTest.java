package org.mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlateauTest {
    @Test
    public void testPlateauGrid(){
        Plateau plateau = Plateau.getInstance(0,0);
        assertNotNull(plateau);
    }

    @Test
    public void testPlateauGridGetGrid(){
        Plateau plateau = Plateau.getInstance(0,0);
        assertEquals(plateau, Plateau.getInstance(1,1));
    }

}
