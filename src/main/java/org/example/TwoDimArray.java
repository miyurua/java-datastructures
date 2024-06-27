package org.example;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
//        declaring the board with the dimension sizes
        char[][] board = new char[3][3];
        System.out.println("bl " + board.length);
//        populating the board with vals
        for(int i=0; i<board.length; i++){
            for(int j=0; j< board.length; j++){
                board[i][j] = '-';
                if(j==0){
                    board[i][j] = 'x';
                }
                else if (i==1 && j==1) {
                    board[i][j] = 'M';
                }
                else{
                    board[i][j] = 'O';
                }
            }
        }

        System.out.println(Arrays.deepToString(board));

//        initialising 2d array with values
        char[][] boardTwo = new char[][]{
                new char[]{'0','-','-'},
                new char[]{'0','-','-'},
                new char[]{'0','-','-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));

    }
}
