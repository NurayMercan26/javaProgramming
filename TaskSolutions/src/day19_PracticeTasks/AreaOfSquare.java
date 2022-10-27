package day19_PracticeTasks;
import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);

           while (true) {
               System.out.println("Enter the side of the square:");
               int side = scan.nextInt();
               if (side < 0) {
                   System.out.println("Invalid Entry for the side of the square");
                   System.exit(0);
               }
               System.out.println("Area of Square:" + side * side);
               System.out.println("Perimeter of Square:" + 4 * side);

               System.out.println("Would you like to calculate another Square?");
               String anotherSide = scan.next();
               while (!(anotherSide.equals("Yes")||anotherSide.equals("No"))){
                   System.out.println("PLEASE, invalid Enter, re-enter until  provides a valid entry");
                   break;
               }
               if (anotherSide.equals("yes")) {
                   System.out.println(" Repeat the previous steps");
               }
               if (anotherSide.equals("No")) {
                   System.out.println("Thank you for using Cydeo Circle Calculator APP");
               }
           }
    }
}
/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers,
				terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */