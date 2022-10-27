package day21_PracticeTask;
import java.util.Arrays;
public class EvenOddNumberArray {
    public static void main(String[] args) {
       int[]numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
           int numbersOdd=1;
           numbersOdd=1;
           int numbersEven=0;
           numbersEven=0;
        for (int each : numbers) {
            if(each%2==0){
                numbersEven++;
            }else{
                numbersOdd++;
            }
        }

        System.out.println(Arrays.toString(numbers)+" has "+ numbersEven+
                " even numbers and "+ numbersOdd+" odd numbers");
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */