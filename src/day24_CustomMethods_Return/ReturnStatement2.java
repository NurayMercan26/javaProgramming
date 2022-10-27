package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(30);
    }
    public static void nameOfMonth(int number) {
        if(number<1||number>12){
            System.out.println("Invalid");
            return;//exits nameOfMonth method remaining code fragments of the method never gets executed
        }

        String name =(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"June":
                (number==6)?"July":(number==7)?"Aug":(number==8)?"Sep":(number==9)?"Dec":(number==10)?"Oct":
                        (number==11)?"Nov": "Dec";

        System.out.println("Month name = " + name);
    }
}
