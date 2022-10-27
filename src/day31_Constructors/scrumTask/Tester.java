package day31_Constructors.scrumTask;

public class Tester {

      public String name;
      public int employeeID;
      public String JopTitle;
      public double salary;


      public Tester(String name, int employeeID, String JopTitle, double salary) {
            this.name = name;
            this.employeeID = employeeID;
            this.JopTitle = JopTitle;
            this.salary = salary;
      }

      public String toString() {
            return "Tester{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", JopTitle='" + JopTitle + '\'' +
                    ", salary= $" + salary +
                    '}';
      }

      public void smokeTesting(){
            System.out.println(name+" is smoke testing");
      }

      public void creatingTicket(){
            System.out.println(name+" is creating testing");
      }


}
/*
Create a class called tester
   Attributes:
      name, employeeID,Salary

      Add a constructor that can set all the fileds

      Actions:
      smokeTesting(), creatingTicket(),dailyStandUp,toString()


 */