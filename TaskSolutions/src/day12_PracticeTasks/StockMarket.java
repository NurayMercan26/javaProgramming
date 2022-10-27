package day12_PracticeTasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("How many total shares they have already?");
               int totalShare=scan.nextInt();

        System.out.println("How much their total value in the stock market is");
              double totalValue=scan.nextDouble();

        System.out.println("Enter the name of company they have the most shares in");
               String companyName= scan.nextLine();
               scan.nextLine();
        System.out.println("Print in the following format:");
               String Format= scan.nextLine();


        System.out.println("totalShare = " + totalShare);
        System.out.println("totalValue = " + totalValue);
        System.out.println("companyName = " + companyName);
        System.out.println("scan = " + scan);

















    }



















}
