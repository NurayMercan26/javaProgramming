package day13_String;

public class StringMethods {
    public static void main(String[] args) {
    
        String word = "Cydeo";
        
        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);

        System.out.println("-------------------------");

        String s1=  "Batch 25 is the best batch. Java Programming Language";

        int totalChars= s1.length();
        System.out.println("totalChars = " + totalChars);
        
        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------");

        String str = "wooden spoon";
        str= str.toUpperCase();
        System.out.println("str = " + str);

       //Today is a great day to learn java programming language.

        String sentence = " Today is a great day to learn java programming language";

        sentence = sentence.toUpperCase();

        System.out.println("sentence = " + sentence);
















        
    }













}
