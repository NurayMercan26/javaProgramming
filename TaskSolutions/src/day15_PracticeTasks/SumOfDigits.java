package day15_PracticeTasks;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a input");


        for (int i = 0; i <= 6; i++) {

            sum += i;
        }
        System.out.println("sum = " + sum);


    }
}


/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */