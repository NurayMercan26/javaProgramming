package day08_IfStatements;



public class salaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;


        double stateTaxRate = 0;
        double federalTaxRate   =26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;



        System.out.println("Gross pay is:$ " + salaryBeforeTax);

        System.out.println("State tax = $" + stateTax);

        System.out.println("Federal tax = $" + federalTax);

        System.out.println("totalTax = " + totalTax);

        System.out.println("salaryAfterTax = " + salaryAfterTax);










    }




}
