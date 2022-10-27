package day13_PracticeTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SameChars {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.next();

        boolean sameChars=word.charAt(0)==word.charAt(word.length()-1);
        System.out.println(sameChars? "same":"different");

        System.out.println("---------------------------------");


                Scanner scan=new Scanner(System.in);

                System.out.println("Please enter a String");
                String string=scan.next();
                char first=string.charAt(0);
                char last=string.charAt(string.length()-1);

                if(first==last){
                    System.out.println("same");
                }
            }
        }

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */
