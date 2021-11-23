package com.tsi.training.NovCoh21.Minesweepertests;

import com.tsi.training.NovCoh21.Minesweeper.Space;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceTest
{
    @Test
    public void testGetIsSafe()
    {
        Space testSpace = new Space(1, 2);
        assertFalse(testSpace.getIsSafe());
    }

    @Test
    public void testSetIsSafe()
    {
        Space testSpace = new Space(1, 2);
        testSpace.setIsSafe(true);
        assertTrue(testSpace.getIsSafe());
    }

    @Test
    public void testGetXCoordinate()
    {
        Space testSpace = new Space(1, 2);
        assertEquals(1, testSpace.getXCoordinate());
    }

    @Test
    public void testSetXCoordinate()
    {
        Space testSpace = new Space(1, 2);
        testSpace.setXCoordinate(3);
        assertEquals(3, testSpace.getXCoordinate());
    }

    @Test
    public void testGetYCoordinate()
    {
        Space testSpace = new Space(3, 3);
        assertEquals(3, testSpace.getYCoordinate());
    }

    @Test
    public void testSetYCoordinate()
    {
        Space testSpace = new Space(1, 2);
        testSpace.setYCoordinate(3);
        assertEquals(3, testSpace.getYCoordinate());
    }

    @Test
    public void testGetAdjacentMines() {
        Space testSpace = new Space(1, 2);
        assertEquals(0, testSpace.getAdjacentMines());
    }

    @Test
    public void testAddToAdjacentMines() {
        Space testSpace = new Space(1, 2);
        testSpace.addToAdjacentMines();
        assertEquals(1, testSpace.getAdjacentMines());
    }

}
