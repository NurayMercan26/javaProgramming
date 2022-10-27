package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;
    public CydeoStudent (String studentName){
        this.studentName = studentName;

    }

    static {
        schoolName = "Cydeo School";
    }

}

class CydeoStudentObject{

    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("jimmy");
        CydeoStudent student2 = new CydeoStudent("Katy");
        System.out.println(student1);

    }
}
