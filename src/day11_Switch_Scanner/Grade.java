package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

            char ch= 'A';
            String result = "";

            switch (ch){

                case 'A':
                    result= "Excellent";
                    break;
                case 'B':
                    result=" Great Jop";
                    break;
                case 'C':
                    result = "Good";
                    break;
                case 'D':
                    result="Passed";
                    break;
                case 'F':
                    result= "Failed";
                    break;
                default:
                    result="invalid";
            }

                System.out.println(result);











    }









}
