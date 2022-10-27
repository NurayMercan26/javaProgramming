package day16_PracticeTasks;
import java.util.Scanner;
public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int positive= 0;
        int negative=0;
        System.out.println(" Please,enter 5 numbers");
        for (int i = 1; i <=5 ; i++) {
            int num= scan.nextInt();
            if(num>0){
                positive ++;
            }else{
                negative++;
            }
        }
        System.out.println("negative = " + negative + "positive = "+ positive);

    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */