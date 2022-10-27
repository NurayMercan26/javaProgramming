package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name= scan.nextLine();
        scan.nextLine();

        System.out.println("Enter your building number");
        String number= scan.next();
        scan.nextLine();

        System.out.println("Enter your Street name");
        String street= scan.nextLine();

        System.out.println("Enter your city name:");
        String city= scan.nextLine();

        System.out.println("Enter your zip code");
        String zipCode= scan.next();

        System.out.println("Enter your country name:");
        String country =scan.nextLine();



        scan.close();

























    }













}
