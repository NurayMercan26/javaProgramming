package day20_PracticeTasks;
public class ClassMates {
    public static void main(String[] args) {
        String[] classMates= {"Java Database","İntel Core ","Display Accessories","Google Chrome","Acrobat Reader",
                "Google Translate","Google Academic","Web Store","Google Earth","Google Maps"};
        for (int i = 0; i < classMates.length; i++) {
            String initial = classMates[i].charAt(0)+"."+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(initial);

        }
    }
}
/*
package day20_Arrays;

public class Classmates_Initials {

    public static void main(String[] args) {

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                                "API Testing", "Database Testing", "Manual Testing"};


        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) +"."+ classmates[i].charAt(  classmates[i].indexOf(" ") + 1);
            System.out.println(initial);

        }




    }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
