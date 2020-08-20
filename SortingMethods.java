import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class SortingMethods {

    public static void sort(int array []){

       // int array [] = {9,8,7,6,5,4,3,2,1};
        // int array [] = {3,6,4,7,3,1};
 
        System.out.println("Inital array    : "+ Arrays.toString(array));
        int temp ;
         int newArr [] = array; 
         for (int k = 0; k < array.length; k++) {
             
             for (int i = 0; i < array.length-1; i++) {
                 if(array[i]>array[i+1]){
                     temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                 }
     
            }

 
         } 
         System.out.println("array sorted in ascending order: " + Arrays.toString(newArr));

    }

    public static int randomNums(){
        int array [] = new int [10]; 
        array[0] = (int) Math.random() * (10);
        return 1;
    }

}