package day22_PracticeTasks;
import java.util.Arrays;
public class ReserveTwoArray {
    public static void main(String[] args) {
      int[][]arr2D={ {1,2,3}, {4,5,6}};

        for (int i = 0; i < arr2D.length; i++) {//i=indexes of each 1D array started from 0
            for (int j = arr2D[i].length-1; j>=0;j-- ) {//j:indexes of each element starting from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[][] arr1D = new int[2][];
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        int[][] result= new int [arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length]; // temporrary array variable to hold the elements
            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(temp.length - 1) - j] = arr2D[i][j]; // getting the last elements of each 1D
                // array and assigning to the beginning indexes of temp array
            }
            result[(arr2D.length - 1) - i] = temp; // assign the 1D temp array to each index of the 2D array
        }

        System.out.println(Arrays.deepToString(result));

    }


}

/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */