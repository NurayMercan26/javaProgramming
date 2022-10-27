package day43_Abstraction.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jopTitle, double salary) {
        super(name, age, gender, id, jopTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");
    }
}
