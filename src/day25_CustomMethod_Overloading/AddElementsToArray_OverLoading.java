package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_OverLoading {

    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6};//7
        numbers = addElement(numbers,7);

        char[]chars = {'A','B','C','D'};//'E'
        chars = addElement(chars,'E');
        String[] names = {"Ahmet","Oleksandr","Sinem","Cihad"};//"Layan"
        names=addElement(names,"Layan");

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));
    }



    //1. create a return method called addInteger that can an Integer after the last index of integer array
    public static int[] addElement(int[]array,int element){
        //1. create a return method called addInteger that can an Integer after the last index of integer array
        //            {1,2,3,4},5
        //            new array===> {1,2,3,4,5}
        int[] result = new int[array.length+1];
        int i =0;
        for (int each:array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //2. create a return method called addDouble that can an double after the last index of double array
    public static double[] addElement(double[]array,double element){
        //2. create a return method called addDouble that can an double after the last index of double array
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each:array) {
            result[i++] = each;

        }
        result [result.length-1] = element;// element need to be assigned to the last index
        //result[i] = element;
        return result;


    }

    //3. create a return method called addString that can an String after the last index of String array
    public static String[] addElement(String[] array, String element) {
        //2. create a return method called addString that can an String after the last index of String array
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;

        }
        result[result.length - 1] = element;// element need to be assigned to the last index
        //result[i] = element;
        return result;
    }

    //4. create a return method called addChar that can an Char after the last index of char array
    public static char[] addElement(char[]array,char element){
        char [] result = new char[array.length+1];
        int i = 0;
        for (char each: array) {
            result[i++] = each;
        }
        result[result.length-1] = element;
        //result[i] = element;
        return result;
    }

}






