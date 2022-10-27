package StringRiplit;

import java.util.Scanner;

public class PrintlastCharacter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length()-1));







    }
}
/*
Write a program that will print out last letter of the word (string).

Ex:
```
Input: java
```
```
Output: a
```
 */