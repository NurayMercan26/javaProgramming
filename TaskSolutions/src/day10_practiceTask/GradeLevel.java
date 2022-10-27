package day10_practiceTask;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 13;
        String result = "";

        if (number == 1 && number <= 5) {
            result = "Elementery school";
        } else if (number == 6 && number <= 8) {
            result = "Middle school";
        } else if (number == 9 && number <= 12) {
            result = "High school";
        } else if (number == 13 && number <= 16) {
            result = "College";
        } else if (number == 17 && number <= 18) {
            result = "Grad School";
        }else
            result="invalid number";

        System.out.println(result);



























}


















}
