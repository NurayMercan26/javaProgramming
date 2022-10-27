package day19_PracticeTasks;

import java.util.Scanner;
public class AreaPerimeterRectangle {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the length of the Rectangle:");
            int ReLength = scan.nextInt();
            if (ReLength == 0 || ReLength < 0) {
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int ReWidth = scan.nextInt();
            if (ReWidth == 0 || ReWidth < 0) {
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }
            System.out.println("Area of rectangle: " + ReLength * ReWidth);
            System.out.println("Perimeter of rectangle" + ReLength * 2 + ReWidth * 2);

            System.out.println("Would you like to calculate another Rectangle?");
            String anotherRectangle = scan.next();

            if (anotherRectangle.equals("yes")) {
                System.out.println("PLEASE!repeat the previous steps ");
            }
            if (anotherRectangle.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);
            }

            while (!(anotherRectangle.equals("yes") || anotherRectangle.equals("no"))) {
                System.err.println("PLEASE! invalid entry, re-enter until  provides a valid entry");
                break;
            }
        }
}
}










/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				 "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */