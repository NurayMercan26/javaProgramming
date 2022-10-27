package day15_PracticeTasks;

public class CheckPalindrome {

    public static void main(String[] args) {
        String word= "Level";
        String reserved = "";

        for (int i= word.length()-1;  i>= 0;  i--) {
            reserved+= word.charAt(i);
        }

        boolean isPalındrome= word.equalsIgnoreCase(reserved);
        System.out.println("isPalındrome = " + isPalındrome);
        System.out.println();
        System.out.println("----------------------------------------");
        String word1="Anna";
        String reserved1= " ";
        for (int i = word1.length()-1; i >=0 ; i--) {
            reserved1+=word1.charAt(i);
        }
         boolean ispalindrome=word1.equalsIgnoreCase(reserved1);
        System.out.println("ispalindrome = " + ispalindrome);

    }
}
/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true


 */