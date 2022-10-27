package day08_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        System.out.println( true==!false);
        System.out.println(!true != false);
        System.out.println(!false==true);

        System.out.println(!!false);
        System.out.println(!!!true);

        System.out.println("---------------------------------");

        int score = 85;
        boolean a= score >= 90 && score <=100;
        boolean b= score >= 80 && score <=89;
        boolean c= score >= 70 && score <=79;
        //boolean c = !a && !b && score >=70
        boolean d = score>= 60 && score >=69;
        boolean f = score>=0 && score <= 59;
        //boolean f = !a &&!b && !c !d



        if (a) {
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if(c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println("Failed");
        }












    }









}
