package com.github.gielr.checkers.model;

public class Board {
    public static String[][] boardArray = new String[8][8];

    public Board() {
        fillBoard();
    }

    private void fillBoard() {
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray.length; j++) {
                if ((i % 2 > 0 & j % 2 == 0 & i < 3) | (i % 2 == 0 & j % 2 > 0 & i < 3)) {
                    boardArray[j][i] = "B";
                } else if ((i % 2 > 0 & j % 2 == 0 & i > 4) | (i % 2 == 0 & j % 2 > 0 & i > 4)) {
                    boardArray[j][i] = "C";
                } else if ((i == 3 & j % 2 == 0) | (i == 4 & j % 2 > 0)) {
                    boardArray[j][i] = " ";
                }
            }
        }
    }

    public void printBoard() {
        System.out.println("\n    A   B   C   D   E   F   G   H");
        System.out.println("  ---------------------------------");
        for (int i = 0; i < boardArray.length; i++) {
            System.out.print(8 - i + " |");
            for (int j = 0; j < boardArray[0].length; j++) {
                if (boardArray[j][i] == "C" | boardArray[j][i] == "B" | boardArray[j][i] == " ") {
                    System.out.print("\u001B[44m " + boardArray[j][i] + " \u001B[0m" + "|");
                } else {
                    System.out.print("\u001B[47m " + " " + " \u001B[0m" + "|");
                }
            }
            if (i == boardArray.length - 1) {
                System.out.println(" " + (8 - i) + "\n  ---------------------------------");
                System.out.println("    A   B   C   D   E   F   G   H");
            } else {
                System.out.println(" " + (8 - i) + "\n  ---------------------------------");
            }
        }
    }
}
