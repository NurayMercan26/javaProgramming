package Loops;

import java.util.Scanner;

public class PrintVowel {


    public static void main(String[] args) {

   Scanner inp= new Scanner(System.in);
   String word= inp.nextLine();
   char isvowel;
   for(int i= 0; i<word.length();i++) {
       isvowel = word.charAt(i);
       if (isvowel == 'a' || isvowel == 'e' || isvowel == 'u' || isvowel == 'o'||isvowel=='i') {
           System.out.print(isvowel);
       }

   }


    }
}
/*
Create a program that will take the given String **In** and print out all the vowels from the String.

Example:

```
Input: howdyho

Output: oo
```

```
Input: huehuehuehue

Output: ueueueue
```
 */