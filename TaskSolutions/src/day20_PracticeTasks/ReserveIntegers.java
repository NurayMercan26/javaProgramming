package day20_PracticeTasks;

import java.util.Arrays;
public class ReserveIntegers {
    public static void main(String[] args) {
        int[] Integer={1,2,3,4,5};
        int[]reserveInteger=new int[Integer.length];
        for (int i = Integer.length-1,j=0; i >=0; i--,j++) {
            reserveInteger[j]=Integer[i];
        }
        System.out.println(Arrays.toString(reserveInteger));
    }
}

/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
 */


