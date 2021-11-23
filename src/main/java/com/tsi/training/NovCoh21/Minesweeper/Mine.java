package com.tsi.training.NovCoh21.Minesweeper;

public class Mine extends Space
{



    ////////////////////////Attributes///////////////////


    ////////////////////////Methods//////////////////////


    ///////////////////////Constructor//////////////////

    public Mine(int xCoordinate, int yCoordinate)
    {
        super(xCoordinate, yCoordinate);
        setIsSafe(false);
    }
}
