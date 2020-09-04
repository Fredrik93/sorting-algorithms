import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateNumbers {

private  static int amountOfIntegersInTxtFile = 60000;
   


    public static int [] generateNums(int amount){
        int arr [] = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 100);
    }
    return arr;

    }
    public static int [] scanFile (){

        Scanner scanner;
        int [] numbers = new int[amountOfIntegersInTxtFile];
        try {
            scanner = new Scanner(new File("numbers.txt"));
           
             int i = 0 ;
             while(scanner.hasNextInt()){
                  numbers[i++] = scanner.nextInt();
                  
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("*** Something went wrong. Check if the filename is correct ***");
        }
        return numbers;
    }

    public static int getAmountOfIntegers(){
        return amountOfIntegersInTxtFile;
        }
}