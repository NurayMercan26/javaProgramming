package day14_PracticeTask;

import java.util.Scanner;

public class emailTask3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String mail5=scan.next();

        String Firstname6= mail5.substring(0,mail5.lastIndexOf("_"));

        String Lastname6=mail5.substring(mail5.indexOf("m"),mail5.indexOf("@"));
        String Domain6=mail5.substring(mail5.indexOf("@")+1, mail5.lastIndexOf(".c"));

        System.out.println("First name:"+Firstname6+"\n"+"Last name:"+Lastname6+"\n"+"Domain:"+Domain6);


    }

}
