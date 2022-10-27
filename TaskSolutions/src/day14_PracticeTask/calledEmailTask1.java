package day14_PracticeTask;

public class calledEmailTask1 {

    public static void main(String[] args) {

  String Email= "mike_tyson@gmail.com";

        Email=Email.replace("tyson", "mike");
        System.out.println(Email);

        Email=Email.replaceFirst("mike","tyson");
        System.out.println(Email);
    }

}
/*
 7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */