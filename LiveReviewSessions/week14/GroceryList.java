package week14;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Scanner;



    public class GroceryList { // blueprint class that holds function and object of Shopping items
// We will create some instance methods that will do the action defined in the print instructions

        private ArrayList<String> groceryList;  // creating an encapsulated object of ArrayList Class

        public GroceryList() {
            groceryList = new ArrayList<>();
        }

        public void addItemToList(String item){
            groceryList.add(item);
        }

        public void modifyGroceryItem (int position, String newItem){
            // set() method modifes arraylist
            groceryList.set(position, newItem);
            System.out.println("Grocery Item "+ (position+1)+" has been modified");
        }
        public void removeItem(int position){
            groceryList.remove(position);
        }
        public String finalItem(String searchItem){
            if(groceryList.size()==0){
               return null;
            }
            String searchResult = "No found";
            int index = groceryList.indexOf(searchItem);
            if(index>=0){
                searchResult = searchItem+ " item found at line"+(index+1);
            }
            return searchResult;
        }

        @Override
        public String toString() {
            String list = "You have " + groceryList.size() + " items in your shopping list";
            for (int i = 0; i < groceryList.size(); i++) {
                list += "\n" + (i + 1) + "." + groceryList.get(i);
            }

            return list;
        }



    }
