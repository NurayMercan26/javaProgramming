package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jopTitle;
    private double salary;

    public Employee(String name, int age, char gender, int employeeID, String jopTitle, double salary) {
        super(name, age, gender);
        setEmployeeID (employeeID) ;
        setJopTitle (jopTitle);
        setSalary (salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public void work(){
        System.out.println(getName()+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" +getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeID=" + employeeID +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a sub class of person named Employee:
      Ekstra variables:
         employeeId, jopTitle, salary

         Encapsulate all the fields

         Add a constructor to set all the fields

         Methods:
             work()
             toString()
 */