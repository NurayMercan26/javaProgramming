package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = scan.nextLine();

        System.out.println("Please, enter your gender");
        String gender = scan.next().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry, please re-enter your age");
            gender = scan.next().toLowerCase();
        }

        System.out.println("are you married");
        String married = scan.next().toLowerCase();

        while (!(married.equals("yes") || married.equals("no"))) {
            System.err.println("Invalid entry, please re-enter your married condition");
            married = scan.next().toLowerCase();
        }

        System.out.println("Please, enter your age");
        int age = scan.nextInt();

        while (age > 120 || age < 0) {

            System.err.println("Invalid entry, please re-enter your age");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day");
        int miles = scan.nextInt();

        while (miles < 5) {

            System.err.println("Invalid entry, please re-enter mileage");
            miles = scan.nextInt();
        }
        scan.nextLine();

        System.out.println("would you like to have full covarege or liability insurance? (full covarege/ liability");
        String insuranceType = scan.nextLine().toLowerCase();

        while (!(insuranceType.equals("full coverage") || insuranceType.equals("liability"))) {

            System.err.println("Invalid entry, please re-enter full covarege or liability");
            insuranceType = scan.nextLine().toLowerCase();
        }

        System.out.println("Have you had any accidents or claims in past five year?(yes/no)");
        String hadAccidentOrClaims = scan.next().toLowerCase();

        while (!(hadAccidentOrClaims.equals("yes") || hadAccidentOrClaims.equals("no"))) {

            System.err.println("Invalid entry, please re-enter! Have you had any accidents or claims in past five years?");
            hadAccidentOrClaims = scan.next().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device?");
        String hasAntiTheftDevice = scan.next().toLowerCase();

        while (!(hasAntiTheftDevice.equals("yes") || hasAntiTheftDevice.equals("no"))) {

            System.err.println("Invalid entry, please re-enter ! Does your car have an anti-theft device?");
            hasAntiTheftDevice = scan.next().toLowerCase();
        }

        double Price = 0;

        if (insuranceType.equals("liability")) {
            if (age < 25) {
                Price += 90;
            } else {
                Price += 50;
            }
            if (miles > 50) {
                Price += 50;
            } else if (miles > 10) {
                Price += 30;
            } else {
                Price += 10;

            }

        } else {

            if(age<25){
              Price+=160;
            }else{
               Price+=120;
            }

            if(miles>50){
                Price+=70;
            }else if(miles>10){
                Price+=40;
            }else{
                Price+=20;
            }

        }

        double DiscountRate = 0;

        if(hasAntiTheftDevice.equals("yes")){
            DiscountRate+=0.05;
        }

        if(hadAccidentOrClaims.equals("yes")){
            DiscountRate-=0.15;
        }else{
            DiscountRate+=0.1;
        }

        if(married.equals("yes")){
            DiscountRate+=0.05;
        }

        double TotalPrice = Price* (1- DiscountRate);

        System.out.println("name =   " + name);
        System.out.println("gender =  " + gender);
        System.out.println("age =  " + age);
        System.out.println("married =  " + married);
        System.out.println("Has Anti Theft Device =  " + hasAntiTheftDevice);
        System.out.println("Had Accident or Claims =  " + hadAccidentOrClaims);
        System.out.println("Insurance Type =  " + insuranceType);
        System.out.println("Your insurance price is: " + TotalPrice);


    }
}
/* 6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person
based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount



*/