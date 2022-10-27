package Week09;

import java.util.Arrays;

public class RemoveSpaces {
    /*
    task 3: write a method that remove all ekstra space from string

   input:"Hello world   I   love     java"

     */
    public static void main(String[] args) {
        String str = "Hello world  I   love     java";
        System.out.println(removeExtraSpaces(str));
    }
    public static String removeExtraSpaces(String input){
        String [] s= input.trim().split("");//this line also keeps empty spaces as a array
         System.out.println(Arrays.toString(s));
         System.out.println(s.length);
        String result = "";
        for (String each: s) {
            if(!each.isEmpty()){//add it to our result string is it is NOT an empty element
                result+=each+"";
            }
        }
        return result;
    }
    public static String removeWithSimpleWay(String input){
        return input.trim().replaceAll(" ","");
    }

}
/*
public class RemoveAllExtraSpace {
    public static void main(String[] args) {

        String str2 = "  Hello world      I      love      Java    ";
        removeAllSpace(str2);
    }

    public static void removeAllSpace(String str) {

           String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            if ( str.charAt(i)==' ' && str.charAt(i+1)==' ') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result.trim());
    }
}
 */