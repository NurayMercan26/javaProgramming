package day43_Abstraction.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jopTitle, double salary) {
        super(name, age, gender, id, jopTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");

    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
