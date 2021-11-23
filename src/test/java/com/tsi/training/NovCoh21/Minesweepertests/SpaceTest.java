package com.tsi.training.NovCoh21.Minesweepertests;

import com.tsi.training.NovCoh21.Minesweeper.Space;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceTest
{
    @Test
    public void testGetSize()
    {
        Space testSpace = new Space(3, 3);
        assertFalse(testSpace.getIsSafe());
    }

    @Test
    public void testSetSize()
    {
        Space testSpace = new Space(3, 3);
        testSpace.setIsSafe(true);
        assertTrue(testSpace.getIsSafe());
    }

}
