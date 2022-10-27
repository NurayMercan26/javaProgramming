package utilities;

public class MathyUtility {
    //a method that can return the sum of two integers
    public static int sumOfTwo(int x, int y){
        int sum=x+y;
        return sum;
    }
    //a method that can return the sum of two decimal numbers
    public static double sumOfTwo(double x, double y){
        double sum=x+y;
        return sum;
    }
    //a method that can return the subtraction of two integers
    public static int subtractionOfTwo(int x, int y){
        int subtractionOfTwo=x+y;
        return subtractionOfTwo;
    }
    //a method that can return the subtraction of two decimals
    public static double subtractionOfTwo(double x, double y){
        double subtractionOfTwo=x+y;
        return subtractionOfTwo;
    }
    //a method that can return the multiplication of two integers
    public static int multiplicationOfTwo(int x, int y){
        int multiplicationOfTwo=x+y;
        return multiplicationOfTwo;
    }
    //a method that can return the multiplication of two decimals
    public static double multiplicationOfTwo(double x, double y){
        double multiplicationOfTwo=x+y;
        return multiplicationOfTwo;
    }
    //a method that can check if an integer is even number
    public static boolean even(int x){
        boolean result= (x%2==0);
        return result;
    }
    //a method that can check if an integer is odd number
    public static boolean odd(int x){
        boolean result= (x%2==1);
        return result;
    }
    //a method that can return the maximum number between two integers
    public static int maxNumber(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    //a method that can return the maximum number between two decimal
    public static double maxNumber(double x, double y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }

    //a method that can return the minimum number between two integers
    public static int minNumber(int x, int y){
        if(x>y){
            return y;
        }else{
            return x;
        }
    }
    //a method that can return the minimum number between two decimal
    public static double minNumber(double x, double y){
        if(x>y){
            return y;
        }else{
            return x;
        }
    }
    //a method that can return the square of an integer
    public static int squareOfNumber(int x){
        int result=x*x;
        return result;
    }
    //a method that can return the square of an double
    public static double squareOfNumber(double x){
        double result=x*x;
        return result;
    }
    //a method that can return the cube of an integer
    public static int cubeOfNumber(int x){
        int result=x*x*x;
        return result;
    }
    //a method that can return the cube of a double
    public static double cubeOfNumber(double x){
        double result=x*x*x;
        return result;
    }
    //a method that passes two double parameters and return the division result
    public static double division(double x, double y){
        double result=x/y;
        return result;
    }



}
