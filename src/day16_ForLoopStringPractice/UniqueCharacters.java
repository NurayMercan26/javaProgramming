package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

     String str= "aabccc";

     String result= "";

     for(int i= 0; i<str.length(); i++){
         char ch= str.charAt(i);

         if ( str.indexOf(ch)==str.lastIndexOf(ch)){//if the first and last numbers of the character are
             // sama,then the character is unique
             result+= ch;
         }


     }


        System.out.println(result);





    }

}
/*
Write a program that can return the unique characters from a string

          Ex:
          input:
          AABCCD

          output:
          BD

          hint: You will need indexOf() and lastİ
 */