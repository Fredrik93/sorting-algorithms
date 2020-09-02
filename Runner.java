import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void run(){
        int amountOfIntegersInTxtFile = 24002;
        long endTime;
        long duration;
        long startTime;
        int [] array =  GenerateNumbers.scanFile();
        int [] testArray = {10,5,1,4,2,3,6,8,7,9};
// int array [] = generateNums(randomNumbers);
        Scanner input = new Scanner(System.in);
        boolean endProgram = false;
   
        while(endProgram != true){
            System.out.println(" ");
            System.out.println("Hi ! Enter a number to choose sorting algorithm: ");
            System.out.println("1. Swap numbers next to eachother ");
            System.out.println("2. Arrays.sort method");
            System.out.println("3. Swap first and last number");
            System.out.println("Press 9 to exit");
            System.out.println("");
            String choice = input.nextLine();
            array = GenerateNumbers.scanFile();

                switch (choice) {
                    case "1":
                    System.out.println("before: " +  Arrays.toString(array));
                    startTime = System.currentTimeMillis();
                    SortingMethods.SwapNumbersNextToEachother(array);
                    endTime = System.currentTimeMillis();
                    duration = (endTime - startTime);
                    System.out.println("After: "+ Arrays.toString(array));
                    System.out.println("The algorithm took " + duration + " millisecond(s) to sort " + amountOfIntegersInTxtFile + " integers" );

                    break;
                    case "2": 
                    System.out.println("before: " +  Arrays.toString(array));
                    startTime = System.currentTimeMillis();
                    SortingMethods.reallyFastSort(array);
                    endTime = System.currentTimeMillis();
                    duration = (endTime - startTime);
                    System.out.println("After: "+ Arrays.toString(array));
                    System.out.println(" ");
                    System.out.println("The algorithm took " + duration + " millisecond(s) to sort " + amountOfIntegersInTxtFile + " integers" );
                    break;
                    
                    case "9":
                    System.out.println("Byebye! ");
                    System.out.println(" ");
                    endProgram = true;
                    break;
                    default:
                    System.out.println("**** Enter a valid key please **** ");
                        break;
                }
         
       
    }


       
    }
}