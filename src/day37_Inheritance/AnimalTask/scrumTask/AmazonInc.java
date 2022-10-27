package day37_Inheritance.AnimalTask.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

       ProductOwner po = new ProductOwner("Suhaib",29,'M',1,160000,"company");
       BusinessAnalyst ba = new BusinessAnalyst("Cihad",30,'M',2,150000,"company");
       ScrumMaster sm = new ScrumMaster("Anel",26,'F',3,145000,"company");

        Tester tester1= new Tester("Chinara",32,'F',"QA",1415,125000,"company");
        Tester tester2= new Tester("Yasaman",31,'F',"QE",1416,130000,"company");
        Tester tester3= new Tester("Irena",29,'F',"SDET",1417,128000,"company");
        Tester tester4= new Tester("Nuray",26,'M',"QA",1418,125000,"company");

        Tester [] testers ={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Daniela",27,'F',"Java Developer",8,135000,"company");
        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("-----------------------------------------");
        for (Tester tester : scrumTeam.testers){
            System.out.println(tester.name +" : "+tester.salary);
        }
    }

}
