package day13_PracticeTasks;

import java.util.Scanner;

public class StringEmpty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String Str= scan.next();

                int sizeStr=Str.length();

        if (sizeStr==0) {
            System.out.println("string is empty");
        } else if (sizeStr>3) {
            System.out.println("print the last three characters");
        } else if (sizeStr <= 3) {
            System.out.println("print the string itself");
        }
    }
    }

/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */