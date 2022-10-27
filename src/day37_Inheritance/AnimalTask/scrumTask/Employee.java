package day37_Inheritance.AnimalTask.scrumTask;

public class Employee extends Person{

    public String jopTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jopTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jopTitle = jopTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jopTitle+" "+name+ "is working");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                "jopTitle='" + jopTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +

                '}';
    }
}
/*
name,gender,age,jopTitle, id salary, companyName
work(), toString()
 */