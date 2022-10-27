package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("How many people your live with?: ");
            int people = scan.nextInt();
            String result = "";

            if (people >= 1){
                if (people < 3){
                    result = "Live with less than 3 people";
                } else if (people >=3 && people <= 6) {
                    result = "Live with 3 - 6 people";
                }else {
                    result = "Live with \"more than 6 people\"";
                }
            }else {
                result = "Invalid number";
            }

            System.out.println("result = " + result);
        }
    }












