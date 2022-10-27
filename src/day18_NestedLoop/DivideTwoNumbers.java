package day18_NestedLoop;



public class DivideTwoNumbers {

    public static void main(String[] args) {


  int a= 30;//a= 30-7=23-7=16-7=9
  int b= 7;
  int count = 0;//1+1=2+1=3+1=4
  while (a>=b){
      a-=b;
      count++;
  }

        System.out.println(count+ " with a remainder of "+ a);





    }


}


/*
Write a program that can divide two positive numbers
without using/division and multiplication operators
 */