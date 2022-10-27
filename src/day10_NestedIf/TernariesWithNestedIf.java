package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s= 70;

        if (s>=60){
            System.out.println("Passed");
        }else if (s<=59){
            System.out.println("Failed");
        } else{
            System.out.println("invalid score");
        }

       String result =(s>=0 && s<= 100)? (s>=60)? "Passed":"Failed": "invalid Score";
        System.out.println(result);


























    }






}
