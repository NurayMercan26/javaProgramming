package day21_PracticeTask;
import java.util.Arrays;
public class Merge3Arrays {
    public static void main(String[] args) {
        int[] array1 = {3, 1, 2};
        int[] array2 = {15, 40, 25, 35};
        int[] array3 = {8, 9, 17, 5, 4, 1};
        int[] mergeArray = new int[array1.length + array2.length + array3.length];
        int j = 0;
        for (int each : array1) {
            mergeArray[j] = each;
            j++;
        }
        for (int each : array2)
            mergeArray[j] = each;
            j++;

        for (int each : array3) {
            mergeArray[j] = each;
            j++;
        }
        System.out.println(Arrays.toString(mergeArray));

        }
        }
/*
5. Write a program that can merge 3 arrays of integers
    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}
			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */