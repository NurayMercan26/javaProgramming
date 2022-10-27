package day14_PracticeTask;

import java.util.Scanner;

public class AddThem {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

                System.out.println("please enter two words of information");
                String s1=input.next();
                String s2= input.next();

                input.close();

                char s4=s1.charAt(s1.length()-1);
                char s5=s2.charAt(0);

                if(s4==s5){
                    String result=s1+s2.substring(1);
                    System.out.println(result);
                }
            }
        }
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */