package com.stackroute.pe3;

public class ChessBoard {
    public String[][] createBoard() {
        String[][] chessboard =new String[8][8];
        String color = "";
        String alternateColor = "";
        for (int i = 0; i < 8 ; i++){
            color = (i%2==0?"WW":"BB");
            alternateColor = (color.equals("WW")?"BB":"WW");
            for (int j = 0; j < 8 ; j++){
                chessboard[i][j] = (j%2==0?color:alternateColor);
            }
        }
//        for (String[] row:
//        chessboard){
//            for (String col :
//                    row) {
//                System.out.print(col+"|");
//            }
//            System.out.println();
//        }
        return chessboard;
    }
}
