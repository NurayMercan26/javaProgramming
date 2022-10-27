package day13_PracticeTasks;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("You are writing your username a code for the log-in function of the Cydeo Application");
           String username= scan.next();
          System.out.println("Enter your password");
           String password= scan.next();



        String username2=new String("Cydeo" );
           System.out.println(username2.equals(username));

           String password2=new String("WoodenSpoon");
           System.out.println(password2.equals(password));
        boolean correctName= username ==username2 && password==password2;
        if (correctName==correctName){
            System.out.println("logged in.");

        }else{
            System.out.println("Incorrect username or password");
        }




    }

}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method



 */