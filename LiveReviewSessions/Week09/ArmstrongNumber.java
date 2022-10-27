package Week09;

public class ArmstrongNumber {

    //153==(1*1*1)+(5*5*5)+(3*3*3)
    public static void main(String[] args) {
        int testNumber = 153;
        System.out.println("isArmstong(testNumber)= "+ isArmstrong(testNumber));
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i)){
                System.out.println("i= "+i);
            }

        }

    }
 public static boolean isArmstrong(int number){
        boolean flag = false;
        int lastDigit = 0;
        int newnumber = 0;
        int originalNumber = number;//since we will do some actions on the number I need store the number at another variable
        while (number>0){
          lastDigit =  number%10;//to find the last digit
            //to get remaining numbr
            number/=10;//shorthand asingment operators

            newnumber+=(lastDigit*lastDigit*lastDigit);
        }
        if(newnumber==number){
            flag=true;
        }
        return flag;
 }
}
/*
public static boolean ArmstrongNumber(int number) {
        boolean armstrong = false;
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result = result + (remainder*remainder*remainder);
            originalNumber /= 10;
        }

        if (result == number) {
            armstrong = true;
        } else {
            armstrong = false;
        }

        return armstrong;
    }
 */