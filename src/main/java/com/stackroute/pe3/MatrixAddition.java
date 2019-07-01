package com.stackroute.pe3;

public class MatrixAddition {
    public int[][] addMatrices(int rows, int cols, int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i< rows; i++){
            for (int j = 0; j< cols;j++){
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }
}
