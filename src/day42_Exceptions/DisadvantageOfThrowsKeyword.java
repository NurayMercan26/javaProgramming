package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void sleep(double seconds) throws InterruptedException {
        //Thread.sleep((long)(seconds*1000));
        System.out.println("Hello");
        MorningWorkOut.sleep(2.5);//try&catch
        System.out.println("Cydeo");
    }
}
