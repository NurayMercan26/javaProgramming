package day21_ForEachLoop;
public class Initials {
    public static void main(String[] args) {

        String[] classmates ={"Cydeo School","Wooden Spoon","Java Programming","SQL Programming","Selenium Automation",
                "APİ Testing","Database Testing","Manuel Testing"};


          for(String each : classmates){
              String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
              System.out.println(initial);
          }






    }
}
