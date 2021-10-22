package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int timesGuessed = 0;
        int totalCoins = 0;
        int treasureAmount = random.nextInt(15);
        treasureAmount += 5;

        String[][] board = new String[10][8];
        int[][] treasureBoard = new int[10][8];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                treasureBoard[i][j] = 0;
                System.out.print(treasureBoard[i][j]);
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[    ]";
                System.out.print(board[i][j]);
            }

            System.out.println("");

        }

        for (int i = 0; i < treasureAmount; i++) {
            int treasureX = getX(8);
            int treasureY = getY(10);
            int treasureCoins = randCoins();
            treasureBoard[treasureY][treasureX] = treasureCoins;

        }

        do {
            int xGuess = 0;
            int yGuess = 0;

            do {
                System.out.println("Please enter your guess for x, between 0 and 8: ");
                try {
                    xGuess = input.nextInt();
                } catch (Exception e) {
                }
            } while (xGuess > 8);

            do {
                System.out.println("Please enter your guess for y, between 0 and 10: ");
                try {
                    yGuess = input.nextInt();
                } catch (Exception e) {
                }
            } while (yGuess > 10);


        } while (timesGuessed < 79);


    }

    public static int getX(int x) {
        Random random = new Random();
        int xNum = random.nextInt(x);
        return xNum;


    }

    public static int getY(int y) {
        Random random = new Random();
        int yNum = random.nextInt(y);
        return yNum;
    }

    public static int randCoins() {
        Random random = new Random();
        int coinNum = random.nextInt(500);
        return coinNum;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }

            System.out.println("");

        }

    }
}
