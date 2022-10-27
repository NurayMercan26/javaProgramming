package StringRiplit;


import java.util.Scanner;

public class Email_2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,1).toUpperCase()+email.substring(1, email.indexOf("_"));
        String lastname = email.substring(6,7).toUpperCase()+email.substring(email.indexOf("_")+2 , email.indexOf("@"));
        String Domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));


        System.out.println("First name: "+ firstName);
        System.out.println("Last name: " +lastname);
        System.out.println("Domain: " +Domain);






  }




    }




/*
Write a program that will print out information about user based on email.
 Print first name, last name, and domain.
 First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

                Example:

```
        Input: craig_federighi@apple.com

```
```
        Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
```



 */