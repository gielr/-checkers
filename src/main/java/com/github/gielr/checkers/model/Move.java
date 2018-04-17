package com.github.gielr.checkers.model;

public class Move {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();

        move("A3", "B4");
        board.printBoard();
    }

    public static void move(String from, String to) {
        Integer[] fromField = split(from);
        Integer[] toField = split(to);

        if (Math.abs(fromField[0] - toField[0]) == 1) {
            Board.boardArray[toField[0]][toField[1]] = Board.boardArray[fromField[0]][fromField[1]];
            Board.boardArray[fromField[0]][fromField[1]] = " ";
        } else if (Math.abs(fromField[0] - toField[0]) == 2) {
            Integer tempfrom1 = fromField[0] - ((fromField[0] - toField[0]) / 2);
            Integer tempfrom2 = fromField[0] - ((fromField[1] - toField[1]) / 2);
            if (Board.boardArray[tempfrom1][tempfrom2] != "" |
                    Board.boardArray[tempfrom1][tempfrom2] != Board.boardArray[fromField[0]][fromField[0]] |
                    Board.boardArray[tempfrom1][tempfrom2] != null) {

            }
        }
    }

    private static Integer[] split(String value) {
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
