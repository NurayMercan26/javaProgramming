package day43_Abstraction.EmployeeTask;

public abstract class Employee  extends Person {

    private final int id;
    private String jopTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jopTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jopTitle = jopTitle;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getJopTitle() {
        return jopTitle;
    }

    public void setJopTitle(String jopTitle) {
        this.jopTitle = jopTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName()+
                "age=" + getAge() +
                "gender=" + getGender() +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
