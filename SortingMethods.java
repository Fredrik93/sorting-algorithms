

public class SortingMethods {

    public static void sort(int array []){

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

  

}