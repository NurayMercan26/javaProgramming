package day13_PracticeTasks;


import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String Split=scan.next();

        System.out.println("Enter the number of people");
        int People= scan.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount= scan.nextDouble();
        double totalTip = checkAmount * 0.25;
        double totalAmountSplit = checkAmount / People+ totalTip;
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String Quality=scan.next();

         if(Quality.equalsIgnoreCase("Excellent")) {
             totalTip = checkAmount * 0.25;
           }else if (Quality.equalsIgnoreCase("Great")) {
                 totalTip = checkAmount * 0.20;
             } else if (Quality.equalsIgnoreCase("Good")) {
                 totalTip = checkAmount * 0.15;
             }else if(Quality.equalsIgnoreCase("Fair")){
                 totalTip=checkAmount*0.10;
             }else if(Quality.equalsIgnoreCase("Poor")){
             totalTip=checkAmount*0.05;
         } else{

         }

         double TotalPerPerson=totalAmountSplit+ totalTip;
         double TipPerPerson= totalAmountSplit/People;


        System.out.println("Number of people entered:"+People+"\n"+ "Total to pay:"+totalAmountSplit+"\n"+
                "Total tip:"+ totalTip+"\n"+"Total per person:"+TotalPerPerson+"\n"+"Tip per person: "+TipPerPerson);

    }

}
/*
2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
package day13_String;
 */