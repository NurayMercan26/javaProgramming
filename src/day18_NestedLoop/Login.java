package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your Password");
        String p= scan.next();

       if(u.equals("Cydeo")&&p.equals("WoodenSpoon")) {
           System.out.println("Logged In");
       }else{

        for (int i = 1; i < 4; i++) {
            System.out.println("Incorrect username or password");
            System.out.println("Enter your user name: ");
            u = scan.next();
            System.out.println("Enter your password");
            p = scan.next();

            if (u.equals("Cydeo") && p.equals("wooden Spoon")) {
                System.out.println("Logged in");
                break;
            }
        }
           if(!(u.equals("Cydeo")&&p.equals("Wooden Spoon"))){
               System.err.println("Your account is locked, Please contact support team");
        }

        }

    }

}
/*
you are writing a code for the log-in function of the Cydeo application assume that your credentials are:
                              username: Cydeo
                              password:WoodenSpoon

        Ask the user enter their credentials.
           if credentials are matched, your program should print "logged in."
           if the credentials are not matched, the program should allow the user to have three
           attempts to

 */
