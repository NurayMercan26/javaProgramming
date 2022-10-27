package day13_PracticeTasks;

import java.util.Scanner;

public class longestString {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1= scan.next();
        String s2= scan.next();

        int size1= s1.length();
        int size2= s2.length();

        if(size1>size2){
            System.out.println(s1);
        }else{
            System.out.println(s2);
        }
    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string
 */