package Arrays;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
String[][]chessBoard = new String[8][8];
        for (int i=0, k=1; i<8; i++, k++){
            char ch='a';
            for (int j=0 ; j<8; j++, ch++){
                chessBoard[i][j]=k+""+ch;
            }
        }

        System.out.println(Arrays.deepToString(chessBoard));
    }


    }

/*
Given a 8x8 two-dimensional array of strings named chessboard.
Initialize values inside an array accordingly to the chess board. So first element in the array,
 chessboard[0] should have a value "1a", and last element in the array, chessboard[7] should have a value "8h".
 */