package day13_PracticeTasks;

import java.util.Scanner;

public class Reserve {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter please write a  reverse string only 5 characters long ");
        String word= scan.next();
        int word1= word.length();

        if (word1 >5){
            System.out.println("Too long!");
        }else if(word1<5){
            System.out.println("Too Short!");
        } else{
            System.out.println("result into the console");
        }
    }

}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */