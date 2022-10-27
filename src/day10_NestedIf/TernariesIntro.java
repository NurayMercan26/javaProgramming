package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

            int n = 0;
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }


            System.out.println("------------------------------");
            String result1 = (n % 2 == 0) ? "Even" : "Odd";
            System.out.println(result1);

        System.out.println("------------------------------------------");


            int age = 17;

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

            System.out.println("------------------------");
            // System.out.println(age>=21)? "Eligible":"Not  Eligible");


            String result2 = (age >= 21) ? "Eligible" : "Not  Eligible";
            System.out.println(result2);

            System.out.println("---------------------------");

            int number = 100;
            if (n % 2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
            String result = (n%20==0)? "Even":"Odd" ;

            System.out.println(result);

            System.out.println("------------------");





























    }




}
