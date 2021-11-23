package com.tsi.training.NovCoh21.Minesweeper;

public class Space
{
    ////////////////////////Attributes///////////////////

    private boolean isSafe;

    private int xCoordinate;

    private int yCoordinate;

    private int adjacentMines;

    ////////////////////////Methods//////////////////////


    ///////////////////////Constructor//////////////////

    public Space(int xCoordinate, int yCoordinate)
    {
        setXCoordinate(xCoordinate);
        setYCoordinate(yCoordinate);
    }

    ////////////////////////Getters & Setters///////////

    public boolean getIsSafe() {return isSafe;}

    public int getXCoordinate() {return xCoordinate;}

    public int getYCoordinate() {return yCoordinate;}

    public int getAdjacentMines() {return adjacentMines;}

    public void setIsSafe(boolean isSafe) {this.isSafe = isSafe;}

    public void setXCoordinate(int xCoordinate) {this.xCoordinate = xCoordinate;}

    public void setYCoordinate(int yCoordinate) {this.yCoordinate = yCoordinate;}

    public void setAdjacentMines(int adjacentMines) {this.adjacentMines = adjacentMines;}
}
