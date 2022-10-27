package day17_PracticeTasks;

import java.util.Scanner;

public class CalculatesNumber {
    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);
        System.out.println("Please,enter your first number");
        int number1= scan.nextInt();
        System.out.println("Please, enter your second number");
        int number2= scan.nextInt();
        System.out.println("Please, enter your math operator");
        char ch = scan.next().charAt(0);

        while (!(ch=='+'|| ch=='-'||ch=='*'||ch=='/')){
            System.err.println("Invalid operator, please re-enter");
            ch=scan.next().charAt(0);
        }
       double result= 0;
        if(ch=='-') {
            result = number1 - number2;
        }else if (ch=='+') {
            result = number1 + number2;
        } else if (ch=='*') {
            result = number1 * number2;
        }else {
            result=number1/number2;
        }

        System.out.println(result);

    }
}
/*
 3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */