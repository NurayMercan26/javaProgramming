package day39_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeID, String jopTitle, double salary) {
        super(name, age, gender, employeeID, jopTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJopTitle()+" "+getName()+" is teaching");
    }
}
/*
Create a sub class of Employee named Teacher

     Override the work method
 */