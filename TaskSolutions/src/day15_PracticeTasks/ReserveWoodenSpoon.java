package day15_PracticeTasks;
public class ReserveWoodenSpoon {
    public static void main(String[] args) {
        String word= "Wooden Spoon";
        String result=" ";

        for (int i = word.length()-1;   i >= 0; i--) {
            result+= word.charAt(i);
        }
        System.out.println(result);
    }
}
