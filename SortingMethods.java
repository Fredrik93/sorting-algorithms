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
        int first = array[0];
        int last = array[array.length-1];
        int temp;
        int k = 1;
        for (int j = 0; j < array.length; j++) {
            
            for (int i = 0; i < array.length; i++) {
                if(array[i] > array[array.length-k]){
                    temp = array[i];
                    array[i] = array[array.length-k];
                    array[array.length-k] = temp;
                    System.out.println("Swapped ! first " + array[i] + "last: " + array[array.length-k]);
                }else{System.out.println(array[i] + " not larger than " + array[array.length-k]);}
    
            }
            k++;





        }
      
       
     


      
    }
  

}