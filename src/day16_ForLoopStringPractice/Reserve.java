package day16_ForLoopStringPractice;

public class Reserve {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:     01234567891011

        String result = ""; //cantain the eserved version of str
        for (int i = str.length()-1;   i >= 0; i--) {
           result += str.charAt(i);
        }

        System.out.println(result);

        System.out.println();


        System.out.println("----------------------------------------------");

        String str2= "I love Java, Java is fun programming language";
        String result1= "";
        for (int i =  str2.length()-1; i >=0 ; i--) {
            result1+= str2.charAt(i);
        }
        System.out.println(result1);
    }

}
/*
        result+=str.charAt(11);//n
        result+=str.charAt(10);//o
        result +=str.charAt(9);//0
        result+=str.charAt(8);//p
        result+=str.charAt(7);//p
        result+= str.charAt(6);//''
        result+= str.charAt(5);//n
        result+= str.charAt(4);//e
        result+= str.charAt(3);//d
        result+= str.charAt(2);//o
        result+= str.charAt(1);//o
        result+= str.charAt(0);//W
        System.out.println(result);
/*





    }

}
/*
Write a program that can reserve a String
Ex inpu:
     Wooden Spoon

     output:
     noopS nedooW
 */