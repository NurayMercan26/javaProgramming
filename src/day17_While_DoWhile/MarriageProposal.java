package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");

        String a = scan.next().toLowerCase();

        while (!(a.equals("yes")||a.equals("no"))) {
            System.out.println("Invalid answer,please re-enter");
            a = scan.next().toLowerCase();
        }

            if (a.equals("yes")) {
                System.out.println("Congrats");
            } else {
                System.out.println("Goodbye");
            }



    }

}
/*
Write a program for the marriage proposal program asking the user,"Will you marry me?"
   if the answer is yes,print "Congrats"
   if the answer is no, print "Goodbye"
   if the answer is neither yes or no,print "Invalid answer, please re-enter" and repeat it until the user enters
 */