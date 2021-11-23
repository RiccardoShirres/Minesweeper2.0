package com.tsi.training.NovCoh21.Minesweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Board
{

    ////////////////////////Attributes///////////////////

    private int size;

    private String difficulty;

    private int totalMines;

    private ArrayList grid;

    private int gridSize;

    ////////////////////////Methods//////////////////////

    public void createGrid(int size)
    {
        setSize(size);
        setGridSize(size);
        int gridSize = getGridSize();
        List<Space> grid = new ArrayList<Space>(gridSize);
        setGrid((ArrayList) grid);

        for (int i=0; i < gridSize; i+=size)
        {
            for (int j=i; j < (i+size); j++)
            {
                Space currentSpace = new Space(i, j);
                grid.add(j, currentSpace);
            }
        }

        Collections.shuffle(grid);
        for (int k=0; k < gridSize; k++)
        {
            Space currentSpace2 = grid.get(k);
            if (k < getTotalMines())
            {
                Mine newMine = new Mine(currentSpace2.getXCoordinate(), currentSpace2.getYCoordinate());
                grid.set(k, newMine);
            }
            else {
                Safe newSafe = new Safe(currentSpace2.getXCoordinate(), currentSpace2.getYCoordinate());
                grid.set(k, newSafe);
            }
        }

        for (Space currentSpace3: grid)
        {
            int cS3xCoord = currentSpace3.getXCoordinate();
            int cS3yCoord = currentSpace3.getYCoordinate();

            List<Space> adjacentSpaces = new ArrayList<Space>(8);

            for (Space currentSpace4: grid)
            {
                int cS4xCoord = currentSpace4.getXCoordinate();
                int cS4yCoord = currentSpace4.getYCoordinate();
                if
                (
                    cS4xCoord == cS3xCoord-1 && cS4yCoord == cS3yCoord-1 ||
                    cS4xCoord == cS3xCoord-1 && cS4yCoord == cS3yCoord ||
                    cS4xCoord == cS3xCoord-1 && cS4yCoord == cS3yCoord+1 ||
                    cS4xCoord == cS3xCoord && cS4yCoord == cS3yCoord-1 ||
                    cS4xCoord == cS3xCoord && cS4yCoord == cS3yCoord+1 ||
                    cS4xCoord == cS3xCoord+1 && cS4yCoord == cS3yCoord-1 ||
                    cS4xCoord == cS3xCoord+1 && cS4yCoord == cS3yCoord ||
                    cS4xCoord == cS3xCoord+1 && cS4yCoord == cS3yCoord+1
                )
                {
                    adjacentSpaces.add(currentSpace4);
                }

            }

            for (Space adjSpace: adjacentSpaces)
            {
                if (!adjSpace.getIsSafe()) {currentSpace3.setAdjacentMines(currentSpace3.getAdjacentMines()+1);}
            }

        }
    }

    ///////////////////////Constructor//////////////////

    public Board(int size)
    {
        createGrid(size);
    }

    ////////////////////////Getters & Setters////////////

    public int getSize()
    {
        return size;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

    public int getTotalMines()
    {
        return totalMines;
    }

    public ArrayList getGrid() {return grid;}

    public int getGridSize() {return gridSize;}

    public void setGridSize(int size)
    {
        this.gridSize = size*size;
    }

    public void setGrid(ArrayList grid)
    {
        this.grid = grid;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public void setDifficulty(String difficulty)
    {
        this.difficulty = difficulty;
    }

    public void setTotalMines(int totalMines)
    {
        this.totalMines = totalMines;
    }
}
