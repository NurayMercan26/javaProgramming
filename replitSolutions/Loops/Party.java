package Loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        String name = "";
        String answer = "";
        String guestList = "";
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Please enter guest name:");
            name = input.next();

            guestList += name+", ";

            System.out.println("Do you want to enter new guest name:");
            answer = input.next().toLowerCase();

            if(answer.equals("no")){
                System.out.println("Guest's list: "+guestList.substring(0, guestList.lastIndexOf(", ")));
                break;
            }

        }


    }

    }



/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

 If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

```
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */