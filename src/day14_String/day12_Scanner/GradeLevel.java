package day14_String.day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 10;
        String result = "";

        if (number >=1 && number <= 18){
          switch(number){
              case 6: case 7: case 8:
                  result = "Middle School";
                   break;

              case 9: case 10: case 11: case 12:
                  result = "High School";
                   break;
              case 13: case 14: case 15: case 16:
                  result="College";
                  break;
              case 17: case 18:
                  result="Grad School";
              default:
                  result="Elementary school";
          }

        }else{
            result = "Invalid Grade";
        }

        System.out.println(result);


    }









}
