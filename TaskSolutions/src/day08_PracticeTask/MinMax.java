package day08_PracticeTask;

public class MinMax {

    public static void main(String[] args) {

        int n1 =100;
        int n2 =200;

        boolean n1isMin= n1 < n2;
        boolean n2isMax= n2>n1;
        boolean  equal= n1==n2;

        if (n1isMin) {
            System.out.println(n1 + "is minimum number");
        }

        if(n2isMax){
            System.out.println(n2+ "is maximum number");
        }

        if (n1==n2){
            System.out.println(equal);
        }








    }


}
