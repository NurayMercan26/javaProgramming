package day16_ForLoopStringPractice;

public class Rem0veDuplicates {
    public static void main(String[] args) {
        String str= "aabbaacc";
        String result= ""; //abc

      for (int i= 0;  i<= str.length()-1; i++){// i= represents the all the index numbers of str(start from 0)

          String ch = ""+ str.charAt(i); // represents each Character of str

          if(!result.contains(ch)){// if the character is not contained in the result
              result +=ch;// the character will be added to the result
          }
      }

        System.out.print(result);






    }


}
