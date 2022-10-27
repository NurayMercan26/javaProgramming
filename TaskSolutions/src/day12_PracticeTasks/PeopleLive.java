package day12_PracticeTasks;

import java.util.Scanner;

public class PeopleLive {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 3:");
        int number= scan.nextInt();
        String result="";

        if(number>0&&number<=3){

            switch (number){

                case 1:
                    result="Live with less than people";
                    break;
                case 2:
                    result="Live with 3-6 people";
                    break;

                case 3:
                    result="live with more than 6 people";
                    break;
            }
        }else{

        }
        System.out.println(result);
















    }
















}
