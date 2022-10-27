package day19_PracticeTasks;
import java.util.Scanner;
public class SalaryTaxCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("How much you make an hour?");
            int hourlyRate= scan.nextInt();
            if(hourlyRate==0||hourlyRate<0){
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHour= scan.nextInt();
            if(weeklyHour<1||weeklyHour>144){
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println("Enter your state tax rate");
            double taxRate= scan.nextDouble();
            if(taxRate<0||taxRate>0.1){
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            System.out.println("1. Gross Salary");
            System.out.println("2. Federal Tax (assume that federal tax rate is 26%");
            System.out.println("3. State Tax");
            System.out.println("4. Total Tax");
            System.out.println("5. Net Income");

            System.out.println("Would you like to continue?");
            String repeat =scan.next();
            if(repeat.equals("yes")){
                System.out.println("Repeat all the previous steps");
            }else if(repeat.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                System.exit(0);
            }else{
                System.out.println("Invalid Entry");
                System.exit(0);
            }

        }
    }
}
/*
5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative,
					terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered  weeklyHouris less than 1 or greater than 144,
					terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%,
					terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */