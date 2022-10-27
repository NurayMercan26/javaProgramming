package day42_Exceptions;



public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("----------------Push up started---------------");

        for (int i = 1; i <=100 ; i++) {
            System.out.print("\rPush up " +i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("-----------------Push ups completed---------------");

        System.out.println("\n----------------Push up started---------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPush up " +i);
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("\n-----------------Push ups completed---------------");
    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
/*

MorningWorkOut:
    1. Do 30 push - ups and try pausing 1.5. seconds in each

    2.  Do 20 push - ups and try pausing 2.5. seconds in each
 */