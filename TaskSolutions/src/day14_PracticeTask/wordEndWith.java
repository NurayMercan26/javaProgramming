package day14_PracticeTask;

import java.util.Scanner;

public class wordEndWith {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Please,enter word");
        String word1=scan.next();

        if(word1.equals("really")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }
        System.out.println("----------------------------------");
         Scanner input=new Scanner(System.in);
        System.out.println("enter the word");
        String Str=input.next();
        int leght= Str.length();
        char lastSecond=Str.charAt(leght-2);
        char last = Str.charAt(leght-1);
        if(lastSecond=='l'&&last=='y'){
            System.out.println("realy???");
        }else{
            System.out.println("never mind");
        }







    }


    /*
     2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
     */








}
