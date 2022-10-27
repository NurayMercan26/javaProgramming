package week14;

import java.util.Scanner;

public class ShopListMakerApp {


    public static Scanner scanner;

    public static int x;
    public static void main(String[] args) {


        System.out.println(x);
        printInstructions();

        Scanner input = new Scanner(System.in);
        boolean toContinue = true;
        while (toContinue) {
            System.out.println("Enter your NEXT choice: ");
            int choice = input.nextInt();
            switch (choice) {

                case 2:
                    System.out.println("Enter your grocery item: ");
                case 4:
                    System.out.println("Enter the item number that will be removed");
                    int itemNumber = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 5:


                case 6:
                    toContinue = false;
                    break;
            }


        }

    }
    public static void printInstructions() {
        x= 10;
        scanner = new Scanner(System.in); //initialize
        System.out.println("Select : ");
        System.out.println("\t 0 - To print menu options.");
        System.out.println("\t 1 - To print the list of Shopping Items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - Quit the application.");
    }

    }

