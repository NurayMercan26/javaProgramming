package Arrays;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {
        boolean result = false ;
        Scanner input = new Scanner(System.in);
        int[]nums={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

       for(int i = 0; i<=nums.length-2; i++){
           //System.out.println(nums [i]+ " "+ nums[i+1]);
           if(nums[i]==5&&nums[i+1]==5){
              // System.out.println(true);
              // return;
               result=true;
               break;
           }
       }

        System.out.println(false);

    }
}
/*
Given an array **nums**, print `true` if the array contains a 5 next to a 5 anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print `false`.

```
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
```
 */