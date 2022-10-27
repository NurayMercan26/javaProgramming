package day37_Inheritance.AnimalTask.scrumTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jopTitle, int id, double salary, String companyName) {
        super(name, age, gender, jopTitle, id, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jopTitle+" "+name+" is crying");
    }

}
