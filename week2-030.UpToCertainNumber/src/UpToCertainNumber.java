
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
//        int start = 1;
        int number = Integer.parseInt(reader.nextLine());
        
//        while (start <= number) {
//            System.out.println(start);
//            start++;
//        }
        for (int start = 1; start <= number; start++) {
            System.out.println(start);
        }
    }
}
