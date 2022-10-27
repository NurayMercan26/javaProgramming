package day16_PracticeTasks;

import java.util.Scanner;

public class StringAndChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String wrd = " ";
        char ch1;
        int output = 0;

        System.out.println("Please enter a word");
        wrd = scan.next();

        System.out.println("Please enter any char");
        ch1 = scan.next().charAt(0);

        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (ch == ch1) {
                output++;
            }
        }
        System.out.println("output = " + output);


    }

}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */