package Loops;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countOfHi=0;
        int lastIndex=0;
        while (lastIndex !=-1){
             lastIndex=str.indexOf("hi",lastIndex);
            if(lastIndex !=-1) {
                countOfHi++;
                lastIndex += "hi".length();

            }

        }
        System.out.println(countOfHi);





    }
}
