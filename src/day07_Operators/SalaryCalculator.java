package day07_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate= 50;
        int weeklyHours= 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;


        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salaryBeforeTax = $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);


















    }






}
