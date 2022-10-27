package day19_PracticeTasks;
import java.util.Scanner;
public class HighFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result= "";
        int maxNumber=0;
        System.out.println("Enter a word: ");
        String word=scan.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            int count=0;
            for (int j = 0; j <word.length() ; j++) {
                char each=word.charAt(j);
                if(ch==each){
                    count++;
                }if(count>maxNumber) {
                    maxNumber = count;
                    result = ch + "";
                }
                count = 0;
            }
            System.out.println(""+result+maxNumber);
        }




    }
}
