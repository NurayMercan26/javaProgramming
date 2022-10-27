package StringRiplit;

import java.util.Scanner;

public class PrintFirstCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(0));

    }

}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Output: j
 */