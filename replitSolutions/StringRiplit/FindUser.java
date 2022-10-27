package StringRiplit;

import java.util.Scanner;

public class FindUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();


        if(fullName.equals("Max Payne")){
            System.out.println("User found!");
        }else if(fullName.equals("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }





    }

}
/*
 Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name.
 Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",
 display message: "User found!".
  Otherwise,  display message: "User not found!". _`Please make your search case insensitive!`_

 */