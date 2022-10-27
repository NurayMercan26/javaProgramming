package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++)
        {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if(size < 2 && size > 0)
        {
            System.out.println(Arrays.toString(num));
        }
        else
        {
            int[] tmp = new int[2];
            for(int i = 0; i < 2; i++)
            {
                tmp[i]=num[i];
            }
            System.out.println(Arrays.toString(tmp));
        }

    }
}

