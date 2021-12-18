package com.bergan.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String[] gridNums = new String[]{null, "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static int[] xArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] oArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";
    static int counter = 0;


    static boolean flipper = true;

    public static void main(String[] args) {
        createGrid();
    }

    public static void createGrid() {
        String[] row1 = {" " + gridNums[1] + " ", "|", " " + gridNums[2] + " ", "|", " " + gridNums[3] + " "};
        String[] row2 = {" " + gridNums[4] + " ", "|", " " + gridNums[5] + " ", "|", " " + gridNums[6] + " "};
        String[] row3 = {" " + gridNums[7] + " ", "|", " " + gridNums[8] + " ", "|", " " + gridNums[9] + " "};

        System.out.println(String.join("", row1));
        System.out.println("---|---|---");
        System.out.println(String.join("", row2));
        System.out.println("---|---|---");
        System.out.println(String.join("", row3));

        getInput();
    }

    public static void getInput() {
        int square = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number 1-9 corresponding to an unclaimed square.");

        do {
            try {
                String input = sc.nextLine();
                square = Integer.parseInt(input);

                if (square == 0) return;

                if (square < 1 || square > 9) {
                    throw new IllegalArgumentException("Number 1-9 only please or 0 to exit");
                }

                if (gridNums[square].equals(ANSI_YELLOW + "X" + ANSI_RESET) ||
                        gridNums[square].equals(ANSI_RED + "O" + ANSI_RESET)) {
                    System.out.println(gridNums[square]);
                    System.out.println("\nThat space is taken!");
                    square = 0;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\n\nNumber 1-9 only please or 0 to exit");
                createGrid();
            } catch (Exception e) {
                System.out.print("\n\nNumber 1-9 only please or 0 to exit");
            }
        } while (square == 0);

        updateGrid(square);
    }

    public static void updateGrid(int square) {
        gridNums[square] = flipper ? ANSI_YELLOW + "X" + ANSI_RESET : ANSI_RED + "O" + ANSI_RESET;

        UsefulMethods.updateWinningArrays(square);

        System.out.println("xArray: " + Arrays.toString(xArray));
        System.out.println("oArray: " + Arrays.toString(oArray));

        if (Arrays.stream(xArray).anyMatch(i -> i == 3)) {
            System.out.println("\nX Wins!!!");
            return;
        }

        if (Arrays.stream(oArray).anyMatch(i -> i == 3)) {
            System.out.println("\nX Wins!!!");
            return;
        }

        flipper = !flipper;

        if (++counter >= 9) {
            System.out.println("\nNobody wins. Please play again.");
            return;
        }

        createGrid();
    }
}


