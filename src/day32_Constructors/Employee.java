package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jopTitle;
    public double salary;

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name,char gender){
        this.name = name;
        this.gender = gender;
    }
    public Employee(String name,char gender,String jopTitle){
        this (name, gender);
        this.jopTitle = jopTitle;
    }
    public Employee(String name,char gender,String jopTitle, double salary){
        this (name, gender,jopTitle);
        this.salary = salary;

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
