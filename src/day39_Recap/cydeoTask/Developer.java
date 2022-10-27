package day39_Recap.cydeoTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, int employeeID, String jopTitle, double salary) {
        super(name, age, gender, employeeID, jopTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJopTitle()+" "+getName()+" is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJopTitle()+" "+getName()+" is developing the application");
    }
}
/*
Create a sub class of Employee named Developer

     Override the work method
       Ekstra methods:
         fixingBugs()
 */