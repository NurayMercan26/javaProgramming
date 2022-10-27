package day20_PracticeTasks;
import java.util.Arrays;
public class ItemsPrices {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,    9.99,     250.0 ,   439.50,    39.99};
        int[] itemIDs =   {12345 ,     12346,    12347,    12348,    12349,     12350};

       int indexGloves=-1;
       boolean hasGotIpad=false;
       String ItemReport="";
        for (int i = 0; i <items.length ; i++) {
            String ItemName= items[i];
            double ItemPrice=prices[i];
            int ItemIDs=itemIDs[i];
            if(ItemName.equals("Gloves")){
                indexGloves=i;
            }
            if(ItemName.equals("ipad")){
                hasGotIpad=true;
            }
            System.out.println(ItemReport=ItemName+" - "+ItemPrice+" -# "+ItemIDs+"\"" );
        }

        System.out.println("indexGloves = " + indexGloves);
        System.out.println("hasGotIpad = " + hasGotIpad);
    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */