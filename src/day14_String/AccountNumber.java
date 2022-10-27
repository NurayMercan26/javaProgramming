package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please,enter an account number");
        String numberWord=input.next();
        boolean numberTwoStart= (numberWord.startsWith("2") && numberWord.length()==7);
        boolean numberFiveStart=(numberWord.startsWith("5")&&numberWord.length()==10);
        if(numberTwoStart){
            System.out.println("Account number begins with a “2” the account number should be 7 characters long");
        }else if(numberFiveStart){
            System.out.println("Account number begins with a “5” the account number should be 10 characters long");
        }else{
            System.out.println("Invalid account number");
        }
    }
}
/*
 6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */