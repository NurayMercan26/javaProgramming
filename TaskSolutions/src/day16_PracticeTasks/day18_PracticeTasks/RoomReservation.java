package day18_PracticeTasks;
import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int price=0;
        while (true) {
            System.out.println("Which bedroom do you wants to reserve?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String bedroom = scan.nextLine().toLowerCase();
            while (!(bedroom.equals("king bed") || bedroom.equals("queen bed") || bedroom.equals("single bed"))) {
                System.out.println("Invalid entry, Please re enter. Which bedroom do you wants to reserve?");
                bedroom = scan.nextLine().toLowerCase();
            }

            System.out.println("How many nights you are staying?");
            int night = scan.nextInt();
            switch (bedroom) {
                case "king bed":
                    price = 120 * night;
                    break;
                case "queen bed":
                    price = 100 * night;
                    break;
                case "single bed":
                    price = 80 * night;
                    break;
            }
            price += price;

                System.out.println("Would you like to reserve another room?");
                String anotherRoom = scan.next();

                while (anotherRoom.equals("yes")) {
                    System.out.println("repeat the entire steps");
                    System.out.println("Which bedroom does he/she wants to reserve?(yes/no)");
                    anotherRoom = scan.next();

                    System.out.println("How many nights he/she is staying");
                  night = scan.nextInt();

                    System.out.println("Would you like to reserve another room?");
                    anotherRoom = scan.next();
                }
                if (anotherRoom.equals("no")) {
                    System.out.println("Return the  total price: $" + price);
                    break;
                }
            }
        }
    }

/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */