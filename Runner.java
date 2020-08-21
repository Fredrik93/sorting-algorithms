import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void run(){
        int amountOfIntegersInTxtFile = 24002;
        long endTime;
        long duration;
        long startTime;
        long convertToMilliseconds = 1000000;
      //  long convertToSeconds = 1000000000;
        int [] copiedArray =  GenerateNumbers.scanFile();
       // System.out.println("unsorted : " + Arrays.toString(copiedArray));

// int array [] = generateNums(randomNumbers);
        Scanner input = new Scanner(System.in);

        System.out.println("Hi ! want to run the sorting algorithm ? Press 1 to continue");
        int choice = input.nextInt();
        boolean flag = true;

        while(flag == true){
         
        if(choice == 1){

            copiedArray =  GenerateNumbers.scanFile();
            System.out.println("unsorted : " + Arrays.toString(copiedArray)+ "Unsorted");


            System.out.println("Thinking...");
            startTime = System.nanoTime();
            SortingMethods.sort(copiedArray);
            endTime = System.nanoTime();
    
            duration = (endTime - startTime);
            //System.out.println("Sorted : " + Arrays.toString(tmp));
            System.out.println("Sorted : " + Arrays.toString(copiedArray)+ "sorted");

            System.out.println("This algorithm took " + duration/convertToMilliseconds + " ms to sort " + amountOfIntegersInTxtFile + " integers");

            System.out.println("Press 1 to go again ");
            choice = input.nextInt();
        }else{
            System.out.println("Byebye! ");
            flag = false;
            input.close();

        }}
    }
}