package day43_Abstraction.EmployeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int id, String jopTitle, double salary) {
        super(name, age, gender, id, jopTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }


    @Override
    public void sleep() {
        System.out.println(getName()+" is slepping 8 hours");
    }
}
