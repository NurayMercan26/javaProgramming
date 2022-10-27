package day15_PracticeTasks;
import java.util.Scanner;
public class sumAllNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0;
        int num1= 0;
        System.out.println("Please, enter a number");
        num1=scan.nextInt();
        for (int i = 1; i <=num1 ; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */