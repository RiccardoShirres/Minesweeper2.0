package com.tsi.training.NovCoh21.Minesweeper;

public class Safe extends Space
{


    ////////////////////////Attributes///////////////////



    ////////////////////////Methods//////////////////////


    ///////////////////////Constructor//////////////////

    public Safe(int xCoordinate, int yCoordinate)
    {
        super(xCoordinate, yCoordinate);
        setIsSafe(true);
    }
}
