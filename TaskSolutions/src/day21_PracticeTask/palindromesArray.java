package day21_PracticeTask;
public class palindromesArray {
    public static void main(String[] args) {
        String[] Names={"Anna","Ağa","Ada","Nacican","Talat","Nalan","Nazan","java","Rüzgar","Hassan","Oleksandry"};
        int num=0;
        for (String each : Names) {
            String reserve="";
            for (int i = each.length()-1; i >= 0; i--) {
                reserve+=each.charAt(i);

            }
            if(each.equalsIgnoreCase(reserve)){
               num++;
            }
        }
            System.out.println(num);
    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */