package StringRiplit;

import java.util.Scanner;

public class VerifyContains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(word));

    }

}
/*
Write a program that will verify if the **sentence** contains **word**. Print out the result as a boolean value.

 */