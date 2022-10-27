package day11_practıcetask;

public class CappucinoBuyer_Switch_Solution {
    public static void main(String[] args) {

        double price=3.89;
        int calories=80;
        String result="";

         result=(price==3.69&&calories==90)?"tall":(price==3.99&&calories==120)? "grande":
                 (price==4.29&&calories==150)?"venti":"invalid size";

        System.out.println(result);







    }











}
