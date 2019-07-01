package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    static ChessBoard chessBoard;

    @BeforeClass
    public static void setUp() {
        chessBoard = new ChessBoard();
    }

    @AfterClass
    public static void tearDown() {
        chessBoard = null;
    }

    @Test
    public void checkChessBoard() {
        //Arrange
        //Act
        String[][] result = chessBoard.createBoard();
        //Assert
        assertArrayEquals(new String[][]{{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}}, result);
    }
}