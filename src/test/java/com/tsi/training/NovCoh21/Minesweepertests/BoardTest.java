package com.tsi.training.NovCoh21.Minesweepertests;

import com.tsi.training.NovCoh21.Minesweeper.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoardTest
{
    @Test
    public void testCreateGrid()
    {
        Board testBoard = new Board(3);
        assertEquals(testBoard.size == 3, true);
    }
}