package day39_Recap.cydeoTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int employeeID, String jopTitle, double salary) {
        super(name, age, gender, employeeID, jopTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJopTitle()+" "+getName()+" is creating ticket");
    }

    @Override
    public void work() {
        System.out.println(getJopTitle()+" "+getName()+" is testing the application");
    }
}
/*
Create a sub class of Employee named Tester
      Override the  work method

      Ekstra methods:
       createTicket()
 */