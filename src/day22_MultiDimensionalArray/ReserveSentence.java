package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReserveSentence {
    public static void main(String[] args) {
        String sentence= "Today is a good day to learn java";

        String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String reservedSentence = "";//java learn to day good is today.
        for (int i = words.length - 1; i >= 0; i--) {
           reservedSentence +=  words[i]+" ";
        }
        System.out.println(reservedSentence);
    }
}
/*
write a program that can reserve sentence
ex:
sentence="Today is a good day to learn java"
output:
java learn to day good is today.
 */