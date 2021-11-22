package com.tsi.training.NovCoh21.Minesweeper;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner readSize = new Scanner(System.in);
        System.out.println("What size square would you like your board to be? (enter an integer)");
        Board game = new Board(readSize.nextInt());

        boolean difficultyNotSet = true;

        do
        {
            Scanner readDifficulty = new Scanner(System.in);
            System.out.println("What difficulty setting would you like? (easy/normal/hard)");
            game.setDifficulty(readDifficulty.nextLine());

            switch (game.difficulty) {
                case "easy", "Easy" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.size);
                }
                case "normal", "Normal" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.size * 3);
                }
                case "hard", "Hard" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.size * 4);
                }
                default -> System.out.println("Please enter easy, normal, or hard");
            }
        } while (difficultyNotSet);

        for (int i = 0 ; i < game.size ; i++)
        {

        }

    }
}
