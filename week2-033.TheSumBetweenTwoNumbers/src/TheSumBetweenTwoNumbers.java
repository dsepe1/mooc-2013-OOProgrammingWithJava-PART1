
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstN = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the second number: ");
        int secondN = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (firstN <= secondN) {
            sum += firstN;
            firstN++;
        }
        System.out.println("Sum is " + sum);
    }
}
