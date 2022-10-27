package day21_ForEachLoop;

public class ReserveNumberEachLoop {
    public static void main(String[] args) {

                int[][] arr2D={{1,2,3},{4,5,6}};
        for (int[] arr1D : arr2D) {
            for (int elements : arr1D) {

                System.out.print(elements);

            }
        }





        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");
            }
            System.out.print(" ");

        }


/*
                int[] arr1= {1,2,3};
                int[] arr2= {4,5,6};

                int[][] arr2D =new int [2][];
                arr2D[0]=arr1;
                arr2D[1]=arr2;

                int[][] result= new int[arr2D.length][];

                for (int i=0; i< arr2D.length; i++){
                    int[] temp = new int[arr2D[i].length];//  temporary  array variable to hold the elements
                    for (int j = 0; j < arr2D[i].length; j++) {
                        temp[(temp.length-1)-j]=arr2D[i][j];//getting the last elements of each 1D array and assigning to the beginning index of temp array
                    }
                    result[(arr2D.length-1)-i]=temp; // assign the 1D temp array to each index of the 2D array
                }
                System.out.println(Arrays.deepToString(result));



 */
            }

        }


