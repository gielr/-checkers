package com.github.gielr.checkers.model;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MoveTest {

    @Test
    public void moveFromA3ToB4() {
        Board board = new Board();
        String[][] boardArray = board.getBoardArray();
        Move move = new Move();

        move.move(boardArray,new String[]{"A3","B4"});

        Assert.assertThat(boardArray[1][4],is("C"));
    }

    @Test
    public void moveFromA3ToB4ThenB4ToC5() {
        Board board = new Board();
        Move move = new Move();
        String[][] boardArray = board.getBoardArray();

        move.move(boardArray,new String[]{"A3", "B4"});
        move.move(boardArray,new String[]{"B4", "C5"});

        Assert.assertThat(boardArray[2][3],is("C"));
    }

    @Test
    public void moveFromA3ToB4ThenB4ToC5ThenD6ToB4() {
        Board board = new Board();
        Move move = new Move();
        String[][] boardArray = board.getBoardArray();

        move.move(boardArray,new String[]{"A3", "B4"});
        move.move(boardArray,new String[]{"B4", "C5"});
        move.move(boardArray,new String[]{"D6", "B4"});

        Assert.assertThat(boardArray[2][3],is(" "));
        Assert.assertThat(boardArray[1][4],is("B"));
    }

    @Test
    public void moveFromA3ToB4ThenB4ToC5ThenD6ToB4ThenC3ToE5() {
        Board board = new Board();
        Move move = new Move();
        String[][] boardArray = board.getBoardArray();

        move.move(boardArray,new String[]{"A3", "B4"});
        move.move(boardArray,new String[]{"B4", "C5"});
        move.move(boardArray,new String[]{"D6", "B4"});
        move.move(boardArray,new String[]{"C3", "A5"});

        Assert.assertThat(boardArray[2][3],is(" "));
        Assert.assertThat(boardArray[1][4],is(" "));
        Assert.assertThat(boardArray[0][3],is("C"));
    }

}