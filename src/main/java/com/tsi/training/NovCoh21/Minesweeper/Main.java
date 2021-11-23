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

            switch (game.getDifficulty()) {
                case "easy", "Easy" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.getSize());
                }
                case "normal", "Normal" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.getSize() * 3);
                }
                case "hard", "Hard" ->
                {
                    difficultyNotSet = false;
                    game.setTotalMines(game.getSize() * 4);
                }
                default -> System.out.println("Please enter easy, normal, or hard");
            }
        } while (difficultyNotSet);





    }
}
