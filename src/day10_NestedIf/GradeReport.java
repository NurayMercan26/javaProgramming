package day10_NestedIf;

import javax.xml.transform.Result;

public class GradeReport {
    public static void main(String[] args) {

        int score = 95;

        if (score <= 0 && score <= 100){

            if(score>=90){
                System.out.println("Excellent");
            }else if(score>=80){
                System.out.println("Great");
            }
            else if(score>=70){
                System.out.println("Good");
            }
            else if(score>=60){
                System.out.println("Passed");
            }
            else if(score>=80){
                System.out.println("failed");
            }

        }else{
            System.out.println("Invalid Score");
        }

        System.out.println("---------------------------------");

        String result = "60";

        if (score <= 0 && score <= 100){

            if(score>=90){
                result= "Excellent";
            }else if(score>=80){
                result="Great";
            }
            else if(score>=70){
                result="Good";
            }
            else if(score>=60){
                result="Passed";
            }
            else if(score>=80){
                result= "failed";
            }

        }else{
            result="Invalid Score";
        }


    }


































}

