package day16_ForLoopStringPractice;

public class Palindrome {

    public static void main(String[] args) {


    String word= "Level";
    String reserved = "";

        for (int i= word.length()-1;  i>= 0;  i--) {
            reserved+= word.charAt(i);
        }

         boolean isPalındrome= word.equalsIgnoreCase(reserved);
        System.out.println("isPalındrome = " + isPalındrome);


        System.out.println("--------------------------------------------");

        String word2= "Cydeo";
        String reserved1= "";

        for (int i = word2.length()-1; i >=0 ; i--) {
            reserved1+= word2.charAt(i);

        }
         boolean isPalındrome1= word2.equalsIgnoreCase(reserved1);
         System.out.println("isPalındrome1 = " + isPalındrome1);
        
    }

}
 /*

     "Java"========>"avanj=====>false(palindrome)
     "Anna"========>"annA"=======>true
     "Level"
     "Racecar"
     "Dad"
     "Mom"
     ............
      */

