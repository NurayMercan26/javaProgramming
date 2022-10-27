package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age  = input.nextInt();//19Enter

        input.nextLine();//Enter

        System.out.println("Enter your full name");
        String fullName = input.nextLine();//Enter

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();//3.5Enter

        input.nextLine();//Enter

        System.out.println("Enter your scholl name: ");
        String schoolName = input.nextLine();//Enter

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }

}
/*

1. Ask the user to enter age(nextInt())
2. Ask the user to enter full name (nextLine())
 */