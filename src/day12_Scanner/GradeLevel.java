package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        byte number = 10;
        String result = "";

        if(number >= 1 && number <= 18){//1~18
             switch (number){
                 case 6: case 7: case 8:
                     result = "Middle school";
                     break;
                 case 9: case 10: case 11: case 12:
                     result = "High school";
                     break;
                 case 13: case 14: case 15: case 16:
                     result = "College";
                     break;
                 case 17: case 18:
                     result = "Grand School";
                     break;
                 default://1~5
                     result = "Elementary School";
             }

        }else{
          result = "Invalid Grade";
        }

        System.out.println(result);
    }
}
/*
Create a class Grade level given a number(byte) grade level determine and print

             grade level and types are:
                   1-5: Elementary School
                   6-8: Middle School
                   9-12: High School
                   13-16: Collage
                   17-18: Grand  School

                   For any  Other grade: Invalid grade level given
                   Note  solution 1:
 */