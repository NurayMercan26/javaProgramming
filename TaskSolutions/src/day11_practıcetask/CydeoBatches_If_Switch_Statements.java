package day11_practıcetask;

public class CydeoBatches_If_Switch_Statements {

    public static void main(String[] args) {

        int number =9;


        if(number>=1&&number<=3){
            switch (number){
                case 1:
                    System.out.println("US morning =====> Class times are 10-5 EST.M,T,Th,F.");
                    break;
                case 2:
                    System.out.println("US evening =====> Class times are 7-10 EST.M,T,W,Th,S,S.");
                    break;
                case 3:
                    System.out.println("EU===>Class times are 10-5 EST.M,T,W,Th,F.");
                    break;

                default :
                    System.out.println("Invalıd Btach");
                    break;

            }

        }else {
            System.out.println("Invalıd number");
        }













    }













}
