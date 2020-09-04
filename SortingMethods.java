import java.util.Arrays;

public class SortingMethods {

    public static void SwapNumbersNextToEachother(int array []){

        int temp ;
         for (int k = 0; k < array.length; k++) {
             
             for (int i = 0; i < array.length-1; i++) {
                 if(array[i]>array[i+1]){
                     temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                 }
     
            }

 
         } 
     //    System.out.println("array sorted in ascending order: " + Arrays.toString(newArr));

    }
    public static void reallyFastSort(int array []){
             Arrays.sort(array);
    }

    public static void swapFirstAndLast(int array []){
       
    }
  

}