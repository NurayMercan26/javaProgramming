package day13_PracticeTasks;

import java.util.Scanner;

public class CalledTravel_Passport_NO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a valid passport?:");
        String No = input.next();
        if (No.equals("No")) {
            System.out.println("The base cost of the passport renewal is:$200");
            System.out.println("When their passport expired:");
            input.next();
            int passportRenewal = 200;
            int passportExDate = 2020;
            int ThisYear = 2022;
            int year = ThisYear - passportExDate;
            int passportAddCost = year * 75;
            System.out.println("Which country they plan to travel:");
            String CountryTravel = input.next();
            System.out.println("Are you will be traveling in the next year ?");
            String Yes = input.next();
            String no = input.next();

            if (Yes.equals("Yes")) {
                passportAddCost += 100;
            } else if (no.equals("no")) {
                passportAddCost -= 50;
            } else {
            }

            int TotalCost=passportAddCost+passportRenewal;
            System.out.println("Looks like your passport has been expired for  "+passportExDate+"  but not to worry we will get it ready for you to travel to $allCountries.\n" +
                    "Your total cost has come out to "+TotalCost);


        }

    }
}
/*
If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your passport has been expired for $years,
        			but not to worry we will get it ready for you to travel to $allCountries.
        			Your total cost has come out to $costAmount."


 */