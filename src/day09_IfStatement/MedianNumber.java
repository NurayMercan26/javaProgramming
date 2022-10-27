package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int  a = 20,
                b= 50,
                c = 10;
        boolean aIsMedian = (a > b && a < c) || ( a>c && a < b);

        boolean bIsMedian = (b> c && b< a) || (b>a && b<c);

        boolean cIsMedian = (!aIsMedian && !bIsMedian);//(c>b && c<a) || (c>a &&)


        if(aIsMedian){
            System.out.println(a+ " is median number");
        }
        if(bIsMedian){
            System.out.println(b+ " is median number");
        }
        if(cIsMedian){
            System.out.println(c+ " is median number");
        }

        /*
        in order for to be the median number:
            1. İf c is the maximum number & is the minimum number, then a is the median number
            2. if b is the maximum number 6 c is the minimum number, then a is the median number
         */









    }





}
