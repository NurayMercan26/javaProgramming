package day25_CustomMethod_Overloading;

import day20_Arrays.ArraysPractice;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
       arr =  addInteger(arr,5);//{1,2,3,4,5}
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");

        double[] arr2 = {1.5,2.5, 3.5, 4.5};
        arr2= addDouble(arr2,5.5);//{1.5,2.5, 3.5, 4.5, 5.5};
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------------------");
        char[] arr3 = {'a','b','c','d'};
        arr3 = addChar(arr3,'e');//{'a','b','c','d','e'};
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------------");
        String [] names = {"Tatiana","Oleksandr","Casandra","Ali"};//"Neira"
       names= addString(names,"Neira");// {"Tatiana","Oleksandr","Casandra","Ali","Neira"}
        names = addString(names,"Igor");//{"Tatiana","Oleksandr","Casandra","Ali","Neira","Igor"}
        System.out.println(Arrays.toString(names));
    }
     public static int[] addInteger(int[]array,int element){
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

     public static double[] addDouble(double[]array,double element){
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


//4. create a return method called addChar that can an Char after the last index of char array
    public static char[] addChar(char[]array,char element){
        char [] result = new char[array.length+1];
        int i = 0;
        for (char each: array) {
            result[i++] = each;
        }
        result[result.length-1] = element;
        //result[i] = element;
        return result;
    }
//3. create a return method called addString that can an String after the last index of String array
public static String[] addString(String[] array, String element) {
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

}
/*
1. create a return method called addInteger that can an Integer after the last index of integer array
            {1,2,3,4},5
            new array===> {1,2,3,4,5}
2. create a return method called addDouble that can an double after the last index of double array
3. create a return method called addString that can an String after the last index of String array
4. create a return method called addChar that can an Char after the last index of char array

 */