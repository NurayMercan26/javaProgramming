package day10_NestedIf;

public class IfstatementsWithoutCurlyBraces {

    public static void main(String[] args) {


        int number = 12;
        String result = "";


        if(number>=1 && number <=12) {
            if (number == 1)
                result = "january";
             else if (number == 2)
                result = "February";
             else if (number == 3)
                result = "March";
             else if (number == 4)
                result = "April";
             else if (number == 5)
                result = "May";
            else if (number == 6)
                result = "June";
             else if (number == 7)
                result = "July";
            else if (number == 8)
                result = "August";
             else if (number == 9)
                result = "Semtember";
             else if (number == 10)
                result = "October";
             else if (number == 11)
                result = "November";
             else if (number == 12) {
                result = "December";
            }else {
                result = "invalid Number";
            }
            System.out.println(result);


        }
















    }



















}

