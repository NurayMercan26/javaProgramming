package day21_ForEachLoop;
public class ReserveName {
    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit","Ali Kilic","Hulya Keles","Simen Kaya","Begench Begenjov",
                "Ruveyda Durna","Jonathan Holly","Alshaun Rodgers","Manas Kalenov","Gulsen Sohret"};
        for (String each : names) {//each: "Elminur Ablimit","Ali Kilic","Hulya Keles"....
            String reserved = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                 reserved+= each.charAt(i);
            }
            System.out.println(reserved);
        }











    }
}
