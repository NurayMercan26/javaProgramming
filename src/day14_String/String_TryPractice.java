package day14_String;

public class String_TryPractice {
    public static void main(String[] args) {

//1. index Char
        String str= "Cydeo";
        char ch= str.charAt(2);
        System.out.println(ch);
  //2.lenght
        String Str= "Wooden Spoon";
        int n1= Str.length();
        System.out.println(n1);
 //3.LowerCase
        String str3= "JAVA";
        str3= str3.toLowerCase();
        System.out.println(str3);
  //4.upperCase

        String str4= "java";
        str4=str4.toUpperCase();
        System.out.println(str4);
 //5.Trim
       String str5= "Java          Programming          Language";
       str5=str5.trim();
       System.out.println(str5);
//6.Index number
        String str6= "Wooden Spoon";
        int indexNumber=str6.indexOf("o");
        System.out.println(indexNumber);

  //7.LastIndex=
       String Str7="Wooden spoon";
       int num= Str7.lastIndexOf("");
        System.out.println(num);

//8.Replace=
        String Str8= "Nuray Mercan";
                Str8=Str8.replaceFirst("n","N");
        System.out.println(Str8);

  //9.ReplaceFirst=
        String  Str9= "Java Programming Language";
        Str9=Str9.replaceFirst("J","N");
        System.out.println(Str9);
        System.out.println("----------------");
        String Str10= "Nuray Mercan";
        Str10=Str10.replaceFirst("Nuray","Mercan");
        System.out.println(Str10);
//10. Substring=
        String str10= "Java Use Enjoy";
        String  result= Str10.substring(4,5+1);
        System.out.println(result);

        String result2=str10.substring(str10.indexOf("v"),str10.lastIndexOf("y"));
        System.out.println(result2);

        String result7= str10.substring(str10.indexOf("e"), str10.indexOf("o"));
        System.out.println(result7);
//11.repeat
        String str11= "nuray";
        String r= str11.substring(str11.indexOf("r"),str11.indexOf("y"));
        System.out.println(r);












    }

}
