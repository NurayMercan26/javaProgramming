package day15_PracticeTasks;

public class ReturnSumOddNumbers {

    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i < 101; i += 2) {
            System.out.println(i+" " );
            sum+=i;
        }

        System.out.println("sum = " + sum);
    }
}



   