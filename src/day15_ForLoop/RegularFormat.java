package day15_ForLoop;

import java.util.Scanner;

public class RegularFormat {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first and last names");
        String firstName= scan.next();
        String lastName= scan.next();
        String str1= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String str2=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(str1  + " " + str2);

    }


}
