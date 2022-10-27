package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {


         Tester tester=  new Tester("Ali",30,'M',42,"SDET",14500000);
         Developer developer = new Developer("Alex",28,'M',32,"Web Developer",15500000);
         Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",8500000);
         Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",7500000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        developer.work();
        developer.sleep();
        developer.unitTest();


    }
}
