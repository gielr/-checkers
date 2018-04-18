package com.github.gielr.checkers.model;


import com.github.gielr.checkers.controller.GameController;

public class Move {
    public static void move(String[][] boardArray, String[] fromTo) {
        GameController gameController = new GameController();

        Integer[] fromField = gameController.split(fromTo[0]);
        Integer[] toField = gameController.split(fromTo[1]);

        if (Math.abs(fromField[0] - toField[0]) == 1) {
            boardArray[toField[0]][toField[1]] = boardArray[fromField[0]][fromField[1]];
            boardArray[fromField[0]][fromField[1]] = " ";

        } else if (Math.abs(fromField[0] - toField[0]) == 2) {
            Integer tempfrom1 = fromField[0] - ((fromField[0] - toField[0]) / 2);
            Integer tempfrom2 = fromField[1] - ((fromField[1] - toField[1]) / 2);

            boardArray[toField[0]][toField[1]] = boardArray[fromField[0]][fromField[1]];
            boardArray[tempfrom1][tempfrom2] = " ";
            boardArray[fromField[0]][fromField[1]] = " ";
        }
    }
}
