package day14_PracticeTask;

import java.util.Scanner;

public class digitCharacter {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please, enter word");
        String wrd1=input.next();
        input.close();
        int firstStart=wrd1.charAt(0);
        if(firstStart>=48&& firstStart<=57){
            System.out.println("first character is digit");
        }else if(firstStart>=65&&firstStart<=90){
            System.out.println("first character is lowercase letter");
        }else if(firstStart>=97&&firstStart<=122){
            System.out.println("first character is uppercase letter");
        }else{
            System.out.println("first character is special character");
        }
    }
}
/*
 5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

        HINT: 1. you need charAt() method
              2. Ascii Table
 */