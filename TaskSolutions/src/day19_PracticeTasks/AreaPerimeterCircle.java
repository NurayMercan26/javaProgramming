package day19_PracticeTasks;
import java.util.Scanner;
public class AreaPerimeterCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle");
           double r= scan.nextDouble();

            System.out.println("Diameter = "+2*r);
            System.out.println("Area = " + r * r * 3.14);
            System.out.println("Perimeter = " + 2 * r *3.14);

            if (r == 0 || r < 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);

            }
            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("No"))) {
                System.out.println("Re-enter until user provides a valid entry");
            }
           if (answer.equals("yes")) {

                System.out.println(" Repeat the previous steps");
            }
            if (answer.equals("No")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
            }
        }
    }
    }

/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers,
				terminate the program after displaying the error message
				 "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */