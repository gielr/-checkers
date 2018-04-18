package com.github.gielr.checkers.model;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class BoardTest {

    @Test
    public void createBoard() {
        Board board = new Board();
        String[][] boardArray = board.getBoardArray();

        Assert.assertThat(boardArray[1][0],is("B"));
        Assert.assertThat(boardArray[3][0],is("B"));
        Assert.assertThat(boardArray[5][0],is("B"));
        Assert.assertThat(boardArray[7][0],is("B"));
        Assert.assertThat(boardArray[0][1],is("B"));
        Assert.assertThat(boardArray[2][1],is("B"));
        Assert.assertThat(boardArray[4][1],is("B"));
        Assert.assertThat(boardArray[6][1],is("B"));
        Assert.assertThat(boardArray[1][2],is("B"));
        Assert.assertThat(boardArray[3][2],is("B"));
        Assert.assertThat(boardArray[5][2],is("B"));
        Assert.assertThat(boardArray[7][2],is("B"));

        Assert.assertThat(boardArray[0][5],is("C"));
        Assert.assertThat(boardArray[2][5],is("C"));
        Assert.assertThat(boardArray[4][5],is("C"));
        Assert.assertThat(boardArray[6][5],is("C"));
        Assert.assertThat(boardArray[1][6],is("C"));
        Assert.assertThat(boardArray[3][6],is("C"));
        Assert.assertThat(boardArray[5][6],is("C"));
        Assert.assertThat(boardArray[7][6],is("C"));
        Assert.assertThat(boardArray[0][7],is("C"));
        Assert.assertThat(boardArray[2][7],is("C"));
        Assert.assertThat(boardArray[4][7],is("C"));
        Assert.assertThat(boardArray[6][7],is("C"));
    }
}