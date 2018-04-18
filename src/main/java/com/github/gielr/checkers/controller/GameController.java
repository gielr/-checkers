package com.github.gielr.checkers.controller;

import java.util.Arrays;
import java.util.List;

public class GameController {
    public boolean validateMove(String[][] boardArray, String[] fromTo) {
        String[] avalibleMoves = {"B8", "D8", "F8", "H8", "A7", "C7", "E7", "G7",
                "B6", "D6", "F6", "H6", "A5", "C5", "E5", "G5", "B4", "D4", "F4", "H4",
                "A3", "C3", "E3", "G3", "B2", "D2", "F2", "H2", "A1", "C1", "E1", "G1"};
        List<String> avalibleMovesList = Arrays.asList(avalibleMoves);
        if (avalibleMovesList.contains(fromTo[0]) && avalibleMovesList.contains(fromTo[1])) {
            Integer[] fromField = split(fromTo[0]);
            Integer[] toField = split(fromTo[1]);

            if (boardArray[fromField[0]][fromField[1]] == null) {
                return false;
            } else {
                if (Math.abs(fromField[0] - toField[0]) == 1) {
                    if (boardArray[toField[0]][toField[1]] != null & boardArray[toField[0]][toField[1]] == " ") {
                        return true;
                    } else {
                        return false;
                    }

                } else if (Math.abs(fromField[0] - toField[0]) == 2) {
                    Integer tempfrom1 = fromField[0] - ((fromField[0] - toField[0]) / 2);
                    Integer tempfrom2 = fromField[1] - ((fromField[1] - toField[1]) / 2);
                    if ((boardArray[tempfrom1][tempfrom2] != " " ||
                            boardArray[tempfrom1][tempfrom2] != null) &&
                            boardArray[toField[0]][toField[1]] == " " &&
                            boardArray[tempfrom1][tempfrom2] != boardArray[fromField[0]][fromField[1]]) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public static Integer[] split(String value) {
        String[] entry = value.split("");
        String[] temp = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Integer[] result = new Integer[2];
        for (int i = 0; i < temp.length; i++) {
            if (entry[0].equals(temp[i])) {
                result[0] = i;
                result[1] = 8 - Integer.parseInt(entry[1]);
            }
        }
        return result;
    }
}
