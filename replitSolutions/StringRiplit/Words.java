package StringRiplit;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word1= scan.next();
        String word2= scan.next();

        if(word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }


    }

}
/*
Check if they are equal
//
//        _Comparison should be case sensitive. "java" and "JaVa" are not equal._
//
//        if they are equal output  "word1 equals word2"
//
//        otherwise output "word1 does not equal word2"
//
//        ```
//        Input:
//        java
//        java
//
//        output:
//        word1 equals word2
//        ```
//
//        ```
//        Input:
//        foo
//        bar
//
//        output:
//        word1 does not equal word2
//        ```
 */