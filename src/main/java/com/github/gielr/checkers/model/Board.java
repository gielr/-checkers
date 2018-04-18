package com.github.gielr.checkers.model;

public class Board {
    private String[][] boardArray = new String[8][8];

    public Board() {
        fillBoard();
    }

    public String[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(String[][] boardArray) {
        this.boardArray = boardArray;
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
}
