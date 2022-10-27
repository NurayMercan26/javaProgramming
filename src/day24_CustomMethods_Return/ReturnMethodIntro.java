package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {

  String str ="Java";
  String result= reserve(str);
        //String reserve(str);
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }
    public static String reserve (String str){//"Java"
     String reserve= "";
     for(int i=str.length()-1;i>=0; i--){
         reserve+=str.charAt(i);
     }
        //System.out.println(reserve);
        return reserve;
    }

}
