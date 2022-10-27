package day09_PracticeTask;

public class WithoutTaxSalary {

    public static void main(String[] args) {

        Long salary = 79L;
        int maritalStatus1 = 1; //Yes
        int maritalStatus2 = 2; //No


        String TaxSalary1 = "salary- salary*%35";
        String TaxSalary2 = "salary- salary*%30";
        String TaxSalary3 = "salary- salary*%25";
        String TaxSalary4 = "salary-salary*%20";



        String TaxMarital = "salary%5";

        if (salary >= 130L && maritalStatus1 == 1) {
            System.out.println(TaxSalary1 +"+"+TaxMarital);
        } else if (salary >= 101L && salary >= 129L && maritalStatus1 == 1) {
            System.out.println(TaxSalary2 +"+"+ TaxMarital);
        } else if (salary >= 81L && salary >= 100L && maritalStatus1 == 1) {
            System.out.println(TaxSalary3 + "+"+TaxMarital);
        } else if (salary <= 80L && maritalStatus1 == 1) {
            System.out.println(TaxSalary3 +"+"+ TaxMarital);
        }

    }
}