import java.util.Arrays;

public class Main {

    public static void main(String[] args) {         
//        int[] original = {1, 2, 3, 4};
//        int[] copied = copy(original);
//
//        // change the copied
//        copied[0] = 99;
//        
//        // print both
//        System.out.println( "original: " + Arrays.toString(original));
//        System.out.println( "copied: " + Arrays.toString(copied));

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
         int[] newArray = new int[array.length];
         for (int i = 0; i < array.length; i++) {
             newArray[i] = array[i];
         }
         return newArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];
        int i = 0;
        while (i < array.length) {
            reverse[array.length - (i + 1)] = array[i];
            i++;
        }
        return reverse;
    }
    
}
