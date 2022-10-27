package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

     initials("cydeo","school");//C.S
        System.out.println("----------------------------------------");
        domain("Cydeo.School@gmail.com");
        System.out.println("----------------------------------------");
        String[]emails = {"Josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------");
        nameOfMonth(11);
    }
//1.Create a method that can display the initials of the person. İnitials (String firstName,String LastName)
    public static void initials(String firstName,String LastName){
        String initial=firstName.charAt(0)+"."+LastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
 //  2. Create a method that can display the domain of the email. domain (String email)
 public static void domain(String email) {//Cydeo.School@gmail.com
     String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
     System.out.println("domain = " + domain);

 }
 //3.Create a method that can display the name of the month based on the given number to the method
   public static void nameOfMonth(int number) {
        String name="";
       // if(number>=1&&number<=12){
            name =(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"June":
            (number==6)?"July":(number==7)?"Aug":(number==8)?"Sep":(number==9)?"Dec":(number==10)?"Oct":
                    (number==11)?"Nov": (number==12)?"Dec":"Invalid";
      //  }else{
           // name = "Invalid";
       // }
       System.out.println("Month name = " + name);
   }
//4.Create a method that can display the name of the day based on the given number to the method
    public static void nameOfDay(int number){

    }
//5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

    }
}



/*
1.Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3.Create a method that can display the name of the month based on the given number to the method
4.Create a method that can display the name of the day based on the given number to the method
5. Create a method that can print how many days a month has
 */