package day11_Switch_Scanner;



public class Calculator {
    public static void main(String[] args) {

        double     n1= 200.5;
        double     n2= 10.5;
        char operator= '+';

        boolean valid= operator =='+' || operator =='-'||operator=='*'||operator=='/';

        if (valid){

                switch (operator){

                    case '+':
                        System.out.println(n1+n2);
                         break;

                    case '-':
                        System.out.println(n1-n2);
                        break;
                    case'*':
                        System.out.println(n1*n2);
                        break;

                    default:
                        System.out.println(n1/n2);



                }








        }else{
            System.err.println("Invalid Operator:"+operator);
        }












    }














}
