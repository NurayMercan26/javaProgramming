package StringRiplit;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String word = scan.next();
         int StringLeght=word.length();
         String tmp=" ";
        for (int i = 0; i < StringLeght/2; i++) {
           // tmp += tmp+=Character.toString(input.charAt(i));
            tmp+=word.valueOf(word.charAt(i));
            for (int j = 0; j <StringLeght/2 ; j++) {
              //tmp+=Character.toString(input.charAt(i));
                tmp+=word.valueOf(word.charAt(i));
            }
        }

        System.out.println(tmp);


    }
}
/*
Write a program that will print out first half of the word twice.


Example:

```
input: java

output: jaja
```
```
input: unity

output: unun
```
 */