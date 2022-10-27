package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String LastName = "Daniel";
        int age = 19;
        String Joptitle = "senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + "  " + LastName;

        //Full name of the person is....
        System.out.println("Full name of the person is " + fullName );

        //.....is.....years old

        System.out.println(fullName + " is  " +  age + " years old  "   +   "jop title is " +  "SDET"  +  " company is " + "Apple Inc") ;


        //fullName is JopTitle, work at CompanyName, and FullName, salary is salary
        System.out.println(fullName + "  is  "  +  Joptitle + ", works at  " + companyName
                + ", and  " +fullName + "'s salary is $ " + salary);





    }





}
