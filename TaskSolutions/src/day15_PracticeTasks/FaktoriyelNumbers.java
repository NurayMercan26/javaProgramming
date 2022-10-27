package day15_PracticeTasks;
import java.util.Scanner;
public class FaktoriyelNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter a number");
        int num2= scan.nextInt();
         int Factorial= 1;
        for (int i = num2; i >1 ; i--) {

          Factorial *= i;
        }
        System.out.println("Factorial = " + Factorial);
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )




 */