package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("---------------------------");
        String s1 = "Cydeo School";
        String reserve =  StringUtility.reserve(s1);
        System.out.println(reserve);
        System.out.println("---------------------------");

        String word = "Java";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("----------------------------");
        String []names = {"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count =0;
        for (String each: names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("---------------------------");
        String s2 = "aaaaabbbbbcccccddddd";
        String nonDup=  StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);

    }
}
