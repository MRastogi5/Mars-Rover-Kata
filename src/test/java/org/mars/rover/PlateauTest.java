package org.mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlateauTest {

    @Test
    public void testPlateauGrid(){
        Plateau plateau = new Plateau(0,0);
        assertNotNull(plateau);
    }
}
