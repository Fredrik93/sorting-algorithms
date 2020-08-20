import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int [] generateNums(int amount){
        int arr [] = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 100);
    }
    return arr;

    }

    private static void sortMethod(){
   
        int array [] = {9,8,7,6,5,4,3,2,1};
        // int array [] = {3,6,4,7,3,1};
 
        System.out.println("Inital array : "+ Arrays.toString(array));
        int temp ;
         int newArr [] = array; 
         for (int k = 0; k < array.length; k++) {
             
             for (int i = 0; i < array.length-1; i++) {
                 if(array[i]>array[i+1]){
                     temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                 }
                 System.out.println(Arrays.toString(newArr));
     
            }
 
         }    }

    public static void main(String[] args) {
        long convertToMilliseconds = 1000000;
        int array [] = generateNums(10000);
        System.out.println("Generated array : "+ Arrays.toString(array));
        long startTime = System.nanoTime();
        SortingMethods.sort(array);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration/convertToMilliseconds);
    }
 
          

}

