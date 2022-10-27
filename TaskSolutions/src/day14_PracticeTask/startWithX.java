package day14_PracticeTask;
import java.util.Scanner;
public class startWithX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please,enter a word");
        String word= scan.next();
        String withoutStartX=word.substring(1);
        System.out.println(withoutStartX);
    }
}
/*
 Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */