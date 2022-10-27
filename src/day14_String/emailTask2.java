package day14_String;

import java.util.Locale;
import java.util.Scanner;

public class emailTask2 {
    public static void main(String[] args) {
     String Email2= "craig_federighi@apple.com";
         String FirstName=Email2.substring(1,5);
         String FirstCapital= Email2.substring(0,1).toUpperCase();
         String LastCapital= Email2.substring(6,7).toUpperCase();
         String lastName= Email2.substring(7,15);
        String domain= Email2.substring(16,21);
        System.out.println("First name:"+FirstCapital+FirstName+"\n"+"Last Name:"+
                LastCapital+lastName+"\n"+"domain:"+domain);

        System.out.println("-------------------------------------------");


        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String firstName = email.substring(0, email.indexOf("_"));
        String lastname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String Domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        String name = firstName.toUpperCase();
        String name2 = lastName.toUpperCase();
        System.out.println("First name: "+ name.substring(0,1)+firstName.substring(1));
        System.out.println("Last name: " +name2.substring(0,1)+lastName.substring(1));
        System.out.println("Domain: " + domain);

        System.out.println("-------------------------------------");

        Scanner Scan =new  Scanner(System.in);
        String mail3=scan.next();

         String Firstname3= mail3.substring(0,mail3.indexOf("_"));
         String Lastname3= mail3.substring(mail3.indexOf("_")+1,mail3.indexOf("@"));
         String Domain1= mail3.substring((mail3.indexOf("@")+1) , mail3.lastIndexOf(".") );

         String Capfirst= Firstname3.toUpperCase();
         String Caplast=Lastname3.toUpperCase();

        System.out.println("First name:"+ Capfirst+Firstname3+"\n"+"Last name:"+Caplast+Lastname3+"\n"+"Domain:"+Domain1);










    }
}

/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */

