package StringRiplit;

import java.util.Scanner;

public class ReserveIt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String tmp="";
        int StringLenght= word.length();
        if(StringLenght<5){
            System.out.println("Too short");
        }else if(StringLenght>5){
            System.out.println("Too long");
        }else{

        }
        for (int i = 4; i >=0 ; i--) {


            tmp+=word.valueOf(word.charAt(i));
        }
        System.out.println(tmp);




    }
}
/*
everse a string _only 5 characters long_.
If word is shorter, display message: "Too short!". If word is longer,
display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:

```
input: cat

output: Too short!
```

```
input: singularity

output: Too long!
```
```
input: apple

output: elppa
```




 */