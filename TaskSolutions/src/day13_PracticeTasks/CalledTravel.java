package day13_PracticeTasks;
import java.util.Scanner;
public class CalledTravel {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Have you a valid passport Yes-No");
        String valid= scan.next();
        String  valid1="Yes";
        String pass=new String("Yes" );
        System.out.println(valid.equals(valid1));



       if (pass.equals(valid1)){
           int baseCost= 1000;
           int bagCost= 0;
           int peopleCost= 0;

           System.out.println(" Which country do you want to travel?");
           scan.nextLine();
           String Country=scan.next();

           System.out.println(" How many bags will you take with you?");
           byte bag= scan.nextByte();
           bagCost=bag*50;

           System.out.println("How many people you will travel with you?");
           short people= scan.nextShort();


           if(people>=3){
               peopleCost = people *100;
           }else
               peopleCost = people*300;
               }

          System.out.println("For each person the cost is reduced by 1 \n" +
                  "Enter the name of the people they will travel with in one\n" +
                  " \t\tline, separating each name with a comma (String, multiple word)\n" +
                  "00. Up to a limit of 300.");

               String name= scan.nextLine();

              int totalCost= scan.nextInt();
             System.out.println("totalCost = " + totalCost);

               }





























    }








/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 1Enter the name of the people they will travel with in one
            		line, separating each name with a comma (String, multiple word)
00. Up to a limit of 300.
            		Ask the user to
            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags
            		 but you are traveling with $peopleYouTravelWith
            		  so we are giving a discount. Your total cost is $costAmount"
 */