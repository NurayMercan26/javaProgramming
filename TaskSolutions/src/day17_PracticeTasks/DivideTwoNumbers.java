package day17_PracticeTasks;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 23;
        int num2 = 8;
        int count = 0;

        while (num1>=num2){
            num1-=num2;
            count++;

        }
        System.out.println(count+" with remainder of "+ num1);
    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */