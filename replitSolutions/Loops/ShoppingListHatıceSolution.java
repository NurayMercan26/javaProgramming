package Loops;

import java.util.Scanner;

public class ShoppingListHatıceSolution {

        public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
            String shoppingListReport = "";
            String item = "";
            String countinue = "";
            double price = 0;
            int count = 1;
            double totalPrice = 0;

            do {
                System.out.println("Enter Item"+count+ " and its price:");
                item = scan.nextLine();
                price = scan.nextDouble();

                shoppingListReport += "Item"+count+": "+item+" Price: "+price+", ";
                totalPrice += price;

                System.out.println("Add one more item?");
                countinue = scan.next().toLowerCase();
                count++;
                if(countinue.equals("no")){
                    System.out.println(shoppingListReport.substring(0, shoppingListReport.lastIndexOf(", ")));
                    System.out.println("Total price: "+totalPrice);
                    break;
                }
                scan.nextLine();

            }while(count <= 10);


        }
    }



