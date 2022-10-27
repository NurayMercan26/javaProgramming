package day18_PracticeTasks;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("Please, enter first  number");
            int number1= scan.nextInt();

            System.out.println("Please,enter a math operator ");
            char mathOper=scan.next().charAt(0);

            while(!(mathOper=='+'||mathOper=='-'||mathOper=='*'||mathOper=='/')){
                System.out.println("Repeat this step until  provides a valid operator");
                mathOper=scan.next().charAt(0);
            }
            System.out.println("Please, enter second number");
            int number2= scan.nextInt();

            double result = (mathOper == '+') ? number1 + number2 : (mathOper == '-') ? number1 - number2 :
                    (mathOper == '*') ? number1 * number2 : number1 / number2;
            System.out.println(result);
            System.out.println("would you like to continue");
            String respond = scan.next();

           while (!(respond.equals("yes")||respond.equals("no"))){
                System.out.println("invalid entry,   re-enter until  provides a valid entry");
                respond=scan.next();
            }

            if(respond.equals("yes")){
                System.out.println("repeat the entire steps");
            }else{
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */