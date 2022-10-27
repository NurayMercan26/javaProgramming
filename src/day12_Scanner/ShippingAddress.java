package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your full name: ");//Java ProgrammingEnter
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");//7925A
        String building = scan.next();

        scan.nextLine();//Enter

        System.out.println("Enter your Street name");
        String street = scan.nextLine();//Jones Branch DriveEnter

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();//McLeanEnter

        System.out.println("Enter your state name:");
        String state = scan.next();//VAenter

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();//22012Enter

        scan.nextLine();//EnterEnter
        System.out.println("Enter your country name: ");
        String country = scan.nextLine();



        scan.close();

    }
}
/*
1. enter your full name (nextLine())
2. Enter your building number(next)
3. Enter your street name(nextLine())
4. Enter your city name(next())
5. Enter your state(next())
6. enter your zip code(next())
  Display the shipping address


 */