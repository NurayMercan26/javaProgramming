package day20_PracticeTasks;
import java.util.Arrays;
public class AllZeros {
    public static void main(String[] args) {
        int[] numbers={10,0,5,0,1,0};
        int[] zeros=new int[numbers.length];
        int j=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] !=0) {
                zeros[j++]=numbers[i];
            }
        }
        System.out.println(Arrays.toString(zeros));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */