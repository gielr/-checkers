package com.github.gielr.checkers.view;

import com.github.gielr.checkers.controller.GameController;
import com.github.gielr.checkers.model.Board;
import com.github.gielr.checkers.model.Move;

import java.util.Scanner;

public class ConsoleView {

    private void printBoard(String[][] boardArray) {
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

    private String[] getMove(){
        String[] result =new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ruch z: ");
        result[0] = sc.nextLine();
        System.out.println("Podaj ruch do: ");
        result[1] = sc.nextLine();

        return result;
    }

    public void run(){
        Board board = new Board();
        Move move = new Move();
        GameController gameController = new GameController();
        boolean test = true;

        printBoard(board.getBoardArray());
        while(test){
            String[] tempMove = getMove();
            if(gameController.validateMove(board.getBoardArray(),tempMove)){
                move.move(board.getBoardArray(),tempMove);
            } else {
                System.out.println("Błędny ruch");
            }
            printBoard(board.getBoardArray());
        }
    }
}
