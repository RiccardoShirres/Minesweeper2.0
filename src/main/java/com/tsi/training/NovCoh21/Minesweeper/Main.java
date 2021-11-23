package com.tsi.training.NovCoh21.Minesweeper;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner readSize = new Scanner(System.in);
        System.out.println("What size square would you like your board to be? (enter an integer)");
        int gameSize = readSize.nextInt();

        boolean difficultyNotSet = true;

        int totalMines = 0;

        String gameDifficulty;

        do
        {
            Scanner readDifficulty = new Scanner(System.in);
            System.out.println("What difficulty setting would you like? (easy/normal/hard)");

            gameDifficulty = readDifficulty.nextLine();

            switch (gameDifficulty) {
                case "easy", "Easy" ->
                {
                    difficultyNotSet = false;
                    totalMines = gameSize;
                }
                case "normal", "Normal" ->
                {
                    difficultyNotSet = false;
                    totalMines = gameSize*2;
                }
                case "hard", "Hard" ->
                {
                    difficultyNotSet = false;
                    totalMines = gameSize*3;
                }
                default -> System.out.println("Please enter easy, normal, or hard");
            }
        } while (difficultyNotSet);

        Board game = new Board(gameSize, totalMines,gameDifficulty);
    }
}
