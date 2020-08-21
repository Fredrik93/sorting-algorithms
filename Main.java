import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
 
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
        long endTime ;
        long duration;
        long startTime;
        long convertToMilliseconds = 1000000;
        long convertToSeconds = 1000000000;
        int randomNumbers = 50000;
       // int array [] = generateNums(randomNumbers);
        Scanner input = new Scanner(System.in);
        System.out.println("Hi ! want to run the sorting algorithm ? Press 1 to continue");
        int choice = input.nextInt();
        boolean flag = true;
        while(flag == true){
         
        if(choice == 1){
            int array [] = generateNums(randomNumbers);
            System.out.println("Thinking...");
            startTime = System.nanoTime();
            SortingMethods.sort(array);
            endTime = System.nanoTime();
    
            duration = (endTime - startTime);
            System.out.println("This algorithm took " + duration/convertToMilliseconds + " ms to sort " + randomNumbers + " integers");
            System.out.println("Press 1 to go again ");
            choice = input.nextInt();
        }else{
            System.out.println("Byebye! ");
            flag = false;
            input.close();

        }}

    }
 
          

}

