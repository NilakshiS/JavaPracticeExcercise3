package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    static MatrixAddition matrixAddition;

    @BeforeClass
    public static void setUp() {
        matrixAddition = new MatrixAddition();
    }

    @AfterClass
    public static void tearDown() {
        matrixAddition = null;
    }

    @Test
    public void givenMatricesShouldReturnSumOfMatrices() {
        //Arrange
        //Act
        int[][] result= matrixAddition.addMatrices(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
        //Assert
        assertArrayEquals(result,new int[][]{{10,10},{10,10},{10,10}});
    }
}