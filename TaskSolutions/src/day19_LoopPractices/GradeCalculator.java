package day19_LoopPractices;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your score");
            int score = scan.nextInt();
            System.out.println("Display the grade of the student.");
            System.out.println("90 ~ 100 ==> A");
            System.out.println("80 ~ 89 ==> B");
            System.out.println("70 ~ 79 ==> C");
            System.out.println("60 ~ 69 ==> D");
            System.out.println("0 ~ 59 ==> F");
            if (score >= 90 && score <= 100) {
                System.out.println("Your grade: A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Your grade: B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Your grade: C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Your grade: D");
            } else if (score >= 0 && score <= 59) {
                System.out.println("Your grade: F");
            } else {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("Would you like to continue");
            String grade=scan.next();

            if(grade.equals("yes")){
                System.out.println("Repeat the previous steps");
            }else if(grade.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }else{
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }
    }
}
/*
 Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */