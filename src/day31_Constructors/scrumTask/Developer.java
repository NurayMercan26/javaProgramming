package day31_Constructors.scrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String JopTitle;
    public double salary;

    public Developer(String name, int employeeID, String JopTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.JopTitle = JopTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JopTitle='" + JopTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

}
/*
Create a class called developer
     Attributes:
     name,employeeID,JopTitle,Salary
     Add a constructer that can set all the fileds

     Actions:
     coding(), unitTesting(),fixingBug(),toString()

 */