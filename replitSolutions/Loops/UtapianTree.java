package Loops;

public class UtapianTree {
    public static void main(String[] args) {
     int growth=0;
     int growthRate;
     for(int i=0; i<=10; i++){
         if(i<4){
             growthRate=1;
         }else{
             growthRate=2;
         }
          growth+=growthRate;
         System.out.println("Year "+i+"-growth "+growthRate+" cm");
         System.out.println(" Tree size: "+growth+" cm");



     }
    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
Show 10 years of growth of the Utopian Tree.

Output:

```
year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
```
 */