import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateNumbers {

   
    public static int [] generateNums(int amount){
        int arr [] = new int[amount];
        for (int i = 0; i < amount; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 100);
    }
    return arr;

    }
}