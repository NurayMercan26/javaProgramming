package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReserveSecondWord {
    public static void main(String[] args) {

        String sentence ="I love java";
        String[] words = sentence.split(" ");
        String reserve = "";
        for (int i = words[1].length()-1; i >=0 ; i--) {
           reserve+= words[1].charAt(i);
        }

        System.out.println(reserve);

       // sentence =sentence.replaceFirst(words[1],reserve);
        words[1]=reserve;
        System.out.println(Arrays.toString(words));
        String result="";
        for (String word : words) {
            result+=word+" ";
            //System.out.print(word+" ");
        }
        System.out.println(result);


    }
}
/*
Write a program that can reserve the second word of the sentence
ex:
sentence = "ı love java;
output:
   I evol Java
 */