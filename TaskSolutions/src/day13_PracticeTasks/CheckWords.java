package day13_PracticeTasks;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter please, write a  three words  for program ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        int wordCheck1 = word1.length();
        int wordCheck2 = word2.length();
        int wordCheck3 = word3.length();

        if (wordCheck1 == wordCheck2 && wordCheck2 == wordCheck3) {
            System.out.println("All words are same length");
        } else if (wordCheck1 == wordCheck2) {
            System.out.println("Not Same nor Different lengths");
        } else if (wordCheck1 > wordCheck2 || wordCheck1 < wordCheck3) ;
        System.out.println("All different length");

    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :Not Same nor Different lengths
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print ""
            - if all different length :  print "All different length"
 */