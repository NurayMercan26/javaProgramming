package day20_Arrays;
public class AverageNumbers {
    public static void main(String[] args) {
      int[]numbers = {10, 20,30,40,50,60};
      double sum = 0;//+10+20+30...
        for (int i = 0; i < numbers.length; i++) {
           sum +=  numbers[i];
        }
        double averageNumber = sum/ numbers.length;

        System.out.println("averageNumber= "+averageNumber);

        int a=5;
        int b=a;
        System.out.println(b);

        int num=-5;
        System.out.println(num+++",");
        System.out.println(num=0);
        System.out.println(","+--num);
        short s =13-9/3*10;
        s+=-10;
        System.out.println(s);

        boolean one=('a'!='z')&&false;
        boolean two=one||0==(9-10+1);
        System.out.println(two);


    }
}
