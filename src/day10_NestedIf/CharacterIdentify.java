package day10_NestedIf;



public class CharacterIdentify {

    public static void main(String[] args) {

        char ch = 'b';

        if (ch >= '0' && ch >= '9') {
            System.out.println("Digit");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Alphabetic1");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Alphabetic2");
        }else
            System.out.println( "special character");
















    }












}
