package day36_Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean ishuman = true;

    public Student(String name, int age, char gender, char grade, String schoolName) {
       setName(name);
       setAge(age);
       setGender(gender);
       setGrade(grade);
       setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
           return;//exits the method
        }

        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A'|| grade=='B'||grade =='C'||grade =='D'||grade=='F')){
            return;//exit method
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create class named Student:
  private variables:
     name,age,gender,grade,scholName

     Encapsulate all the fields (at least encapsulate two fields manually)
        requirements:
           1. age should not be set less than 5 or greater than 90
           2.gender should not be set any character other than: 'M' and 'F'
           3. grade should not be set to any characters other than: 'A', 'B','C','D'

           Add a constructor that can set all the fields when the object is created
           (requirements of fields in the above must be applied)
 */