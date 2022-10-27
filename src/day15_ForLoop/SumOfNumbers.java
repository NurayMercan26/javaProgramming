package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

     double sum=0;

        for (int i = 1; i <101; i++) {//i= 1,2,3,4,5,6,......100
           sum += i;
        }
        System.out.println(sum);

        System.out.println("-------------------------------------------");

        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            System.out.println("Enter a number");
            total += scan.nextInt();
        }
        System.out.println("total="+total);
    }
}
