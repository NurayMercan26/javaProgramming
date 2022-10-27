package day12_Scanner;


import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age= input.nextInt();


        System.out.println("Enter the your name:");
        String name=input.nextLine();


        System.out.println("Enter your GPA:");
        double gpa=input.nextDouble();


        System.out.println("enter your school name:");
        String school=input.nextLine();




        System.out.println("age = " + age);


        System.out.println("name = " + name);



        System.out.println("gpa = " + gpa);



        System.out.println("school = " + school);



       input.close();










    }












}
