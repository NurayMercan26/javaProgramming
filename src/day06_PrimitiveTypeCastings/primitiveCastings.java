package day06_PrimitiveTypeCastings;

public class primitiveCastings {

    public static void main(String[] args) {

          byte  a = 100;
          short b=  a;
          int   c = b;
          long  d = c;
          float e = d;
          double f = e;

        System.out.println(".....................................");

        int x = 55;
        short y = (short)x;

        System.out.println(x+ ":" +y);


        long j = 1000000;
        short k = (short)j;

        System.out.println(j+":"+k);

         double l = 2.5;
         float m = (float)l;

        System.out.println(l+ ":" + m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n+ ":"+s);







    }






}
