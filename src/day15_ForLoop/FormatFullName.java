package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args){

        String firstName= "cyDEo",
                lastName="SCHOOL";

        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName=firstName +" "+ lastName;
        System.out.println("FullName = "  + fullName);



        String firstname1= "JOSH";
             String    lastname1="smITH";

        firstname1=firstname1.substring(0,1).toUpperCase()+ firstname1.substring(1).toLowerCase();

        lastname1=lastname1.substring(0,1).toUpperCase()+lastname1.substring(1).toLowerCase();

        System.out.println(firstname1);
        System.out.println(lastname1);
        String Fullname= firstname1+" "+lastname1;
        System.out.println("Full name = " + Fullname);





    }




}
