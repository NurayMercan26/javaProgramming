package day15_PracticeTasks;
public class RetiveDigitsLettersSpecialCharacters {
    public static void main(String[] args) {
        String Str= "mn@#123Ab!";

        String Digits= " "; //1,2,3
        String Letters=" ";//m,n,A,b
        String SpecialCharacters= " ";//@#!

        for (int i = 0; i <Str.length() ; i++) {
            char ch= Str.charAt(i);
        if(ch>='0'&& ch<='9' ) {
            Digits += ch;
        } else if ( ch>='A' && ch<= 'Z') {
            Letters += ch;
        } else if( ch >='a' && ch<= 'z'){
            Letters += ch;
        }else{
            if(ch != ' '){
                SpecialCharacters += ch;
            }
        }

        }

        System.out.println("Letters = " + Letters);
        System.out.println("Digits = " + Digits);
        System.out.println("SpecialCharacters = " + SpecialCharacters);

    }
}
/*
5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */