package day13_PracticeTasks;
import java.util.Scanner;

public class returnInitials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  yours school first name");
        String schoolFirstName= scan.next();

        System.out.println("Enter yours school last name");
        String schoolLastName= scan.next();
        char F= schoolFirstName.charAt(0);
        char L=schoolLastName.charAt(0);
        String ReturnInitials= F+"."+L;
        System.out.println("ReturnInitials = " + ReturnInitials);

        String ouput = "c.s";
        ouput= ouput.replaceFirst("c.s","C.S");
        System.out.println("ouput = " +"\n"+ ouput);


    }
}
/*
 write a program that can return the initials of the user
            ex:
                cybertek 
                school
            output:
                C.S
        Note: Pay attention to the example output

 */