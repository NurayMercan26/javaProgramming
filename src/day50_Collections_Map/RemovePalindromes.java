package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","level","rotor","kayak","reviver",
                        "racecar","madam")
        );

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reserve = "";

            for (int i = each.length()-1; i>=0; i--){
                reserve+= each.charAt(i);
            }
            if(each.equalsIgnoreCase(reserve)){
                it.remove();
            }

        }

        System.out.println(names);
        System.out.println("--------------------------------------------------------------");

List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java","Python","Cydeo","Car","Level","civic","radar","level","rotor","kayak","reviver",
                        "racecar","madam")
        );

        /*
         Predicate<String> palindrome = str -> {
            String reserve = "";

            for (int i = str.length()-1; i>=0; i--){
                reserve+= str.charAt(i);
            }
            return reserve.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);
        System.out.println(names2);
         */

   names2.removeIf(str ->{String reserve = "";

       for (int i = str.length()-1; i>=0; i--){
           reserve+= str.charAt(i);
       }
       return reserve.equalsIgnoreCase(str);});

        System.out.println(names2);
    }
}
