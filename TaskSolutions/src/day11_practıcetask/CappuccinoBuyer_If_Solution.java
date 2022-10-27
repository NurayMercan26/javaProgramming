package day11_practıcetask;

public class CappuccinoBuyer_If_Solution {

    public static void main(String[] args) {

        double price1= 3.70;
        double price2=3.98;
        double price3=4.20;

        int calories1= 97;
        int calories2= 124;
        int calories3= 152;

        boolean  tall= (price1==3.69 && calories1== 90);
        boolean  grande=(price2==3.99 && calories2==120);
        boolean venti= (price3==4.29 && calories3==150);
        boolean InvalidSize= (!tall||!grande||!venti);

        if(price1==3.69 && calories1== 90){
            System.out.println("Valid sizes are tall and  their is "+ tall);
        }
        if(price2==3.99 && calories2==120) {
            System.out.println("Valid sizes are grande  and their is "+ grande );
        }
        if (price3==4.29 && calories3==150) {
            System.out.println("Valid sizes are venti  and their is "+venti);
        } else{
            System.out.println("Invalid Size");
        }


































    }










}
