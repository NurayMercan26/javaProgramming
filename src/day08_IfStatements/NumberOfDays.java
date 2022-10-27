package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

         int number = 5; //1~12
         boolean has28Days = number== 2; //for the month that has 28 days
         boolean has30Days = number==4 || number==9 || number == 11;//forthe months that has 30 days
         boolean  has31Days = !has28Days&& !has30Days;//if the month does not have 28 days and does not have 30 days


        if(has28Days) {
            System.out.println("28 days");
        }
        if(has30Days) {
            System.out.println("30 days");
        }
        if(has31Days) {
            System.out.println("31days");
        }









    }



}
