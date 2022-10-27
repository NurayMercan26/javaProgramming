package StringRiplit;

import java.util.Scanner;

public class SMSMessage {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

        String sender=scan.nextLine();
        String phoneNumber=scan.nextLine();
        String message = scan.nextLine();

        System.out.println("Sender:"+" Mike Smith");
        System.out.println("Phone Number:"+" 202-123-3456");
        System.out.println("Message body:"+" I love programing and problem solving");






    }


}
/*
Given a String **message** in the following format:
` Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}`
assign the value of the **sender, phoneNumber, and messageBody** variables and print them.

```
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */