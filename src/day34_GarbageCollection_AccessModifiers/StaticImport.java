package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathyUtility.*;
public class StaticImport {

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("-------------------");

        //find the sum of 10,20
       int r1 =  sumOfTwo(10,20);

        // find the sum of 100,200
        int r2 = sumOfTwo(100,200);

        int r3 = subtractionOfTwo(100,50);

       int r4 =  maxNumber(1000,2000);




    }


}
