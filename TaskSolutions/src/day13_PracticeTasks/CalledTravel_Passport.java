package day13_PracticeTasks;

import java.util.Scanner;

public class CalledTravel_Passport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Have you a valid passport (yes or no)");
        String valid1 = scan.next();
           String valid2="Yes";
        if (valid2=="Yes") {
            System.out.println("The base cost of the ticket should be set to: 1000");
            int Cost = 1000;
            System.out.println(" Are you which country they to travel to");
            String country = scan.next();
            scan.nextLine();
            System.out.println("how many bags they will take with them (byte)");
            byte bag = scan.nextByte();
            double bagCost = Cost + 50;
            if (bag > 1) {
                System.out.println(bagCost);
            } else {
                System.out.println(Cost);
            }
            System.out.println("how many people they will travel with (short)");
            Short people = scan.nextShort();
            double discountPeople = Cost - 100;
            double TotalCost = Cost + bagCost - discountPeople;
            if (people <= 100 && people == 300) {
                System.out.println("Enter the name of the people " +
                        "they will travel with in one line, separating each" +
                        " name with a comma (String, multiple word)");
            } else {

            }

            System.out.println("Your ticket is booked to:" + Cost + "\n" + "Country Name:" + country + "\n" +
                    "We have charged extra for : " + bagCost + "\n" + "you are traveling with people so we are giving a discount:" + discountPeople +"\n"+ " Your total cost is:" + TotalCost);

        }
        }

    }
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		 We have charged extra for the $numberOfBags bags
            		 but you are traveling with $peopleYouTravelWith so we are giving a discount.
            		 Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			 but not to worry we will get it ready for you to travel to $allCountries.
        			  Your total cost has come out to $costAmount."


 */