package day12_PracticeTasks;

public class CappucinoBuyer_Ifelse_solution {

    public static void main(String[] args) {

        double price= 3.69;
        int calories=90;
        String result="";


        Boolean priceCalories=(price == 3.69 && calories == 90)&&(price==3.99&&calories==120)&&
                (price==4.29&&calories==150);

        if (priceCalories) {

            }else if (priceCalories= price== 3.69 && calories == 90) {
            result="Valid sizes are tall";
            }else if (priceCalories=price==3.99&&calories==120) {
            result = "Valid sizes are grande";
            } else if (priceCalories=price==4.29&&calories==150){
            result= "Valid sizes are venti";

            }else{
            result="invalid  size";
        }

        System.out.println(result);



    }















}
