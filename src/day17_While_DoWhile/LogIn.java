package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();


        System.out.println("Enter your password:");
        String p = scan.next();

       if(u.equals("Cydeo")&&p.equals("Cydeo123")){
           System.out.println("Loggid in");
       }else {
           int attempts = 3;

           while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0) {
               System.out.println("Incorrect username or password,please re-enter");

               System.out.println("Enter your username");
               u= scan.next();
               System.out.println("Enter your password");
               p = scan.next();
               attempts--;
           }

           if ( u.equals("Cydeo")&&p.equals("Cydeo123")){
               System.out.println("loggid in");
           }else{
               System.out.println("Your account is locked");
           }



       }








    }

}
/*
you are writing a code for the log- in function of the Cybertek application, assume that your credentials are:
                          username:Cydeo
                          password: Cydeo123
       ask the user to enter their credentials.
       if credentials are matched, your program should print "Logged in."
       if the credentials are not matched, the program should allow the user to have three attempts to enter correct
       credentials and if all three attempts are failed, then print "your account is locked."

       for(int i = 1 i<=3; i++){

          if(valid){
          sout("loged in")
          }
          if(i==3){
          sout(Your account  is locked)
          }
      }
 */