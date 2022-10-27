package day11_practıcetask;

public class floorNumber_If_Switch_Statements {
    public static void main(String[] args) {

        int number=9;

         if(number>=1&&number<=3){
             switch(number){
                 case 1:
                     System.out.println("Floor 1 selected.Companies:Lobby,Verizon,Starbucks");
                     break;
                 case 2:
                     System.out.println("Floor 2 selected.Companies:Cybertek,NASA,Intelsat");
                     break;
                 case 3:
                     System.out.println("Floor 3 selected.Companies:Lyft,BoFa,Stake House");
                     break;
                 default:
                     System.out.println("invalid floor-6");

             }

        }else{
             System.out.println("invalid number");
         }












    }















}
