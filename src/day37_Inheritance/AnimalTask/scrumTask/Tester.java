package day37_Inheritance.AnimalTask.scrumTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jopTitle, int id, double salary, String companyName) {
        super(name, age, gender, jopTitle, id, salary, companyName);
    }
    public void createTicket(){
        System.out.println(jopTitle+" "+name+ "is creating ticket");
    }

}
