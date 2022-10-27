package Loops;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
/*
public class PrintShape {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
                System.out.println();
            }
        }
    }
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i <10 ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

 */



