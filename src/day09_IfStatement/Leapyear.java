package day09_IfStatement;
import java.time.Year;
public class Leapyear {

    public static void main(String[] args) {

        int Year = 2000;

        boolean LeapYear =Year % 4 ==0;

        if (LeapYear){
            System.out.println( "Year" + Year +" is a leap year");
        }
        if (!LeapYear){
            System.out.println("Year" +Year + " is NOT a leap year");
        }
        System.out.println("-------------------------------");

       if (LeapYear){
           System.out.println( "Year" + Year + " is a leap year");
       }else{
           System.out.println("Year" + Year + " is a leap year");
       }

















    }












}
