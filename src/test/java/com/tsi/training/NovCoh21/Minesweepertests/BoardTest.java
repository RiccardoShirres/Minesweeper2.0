package com.tsi.training.NovCoh21.Minesweepertests;

import com.tsi.training.NovCoh21.Minesweeper.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BoardTest
{
    @Test
    public void testGetIsSafe()
    {
        Board testBoard = new Board(3, 3, "easy");
        assertTrue(testBoard.getSize() == 3);
    }

    @Test
    public void testSetSize()
    {
        //Board testBoard = new Board();
    }
}