package day14_PracticeTask;
import java.util.Scanner;

public class WithoutFirst {

    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("please, enter two words ");
        String wordOne= Scan.next();
        String wordTwo=Scan.next();

        String withoutFirstwordOne=wordOne.substring(1);
        String withoutFirstwordTwo=wordTwo.substring(1);

        String result= withoutFirstwordOne+withoutFirstwordTwo;
        System.out.println(result);


    }

}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */