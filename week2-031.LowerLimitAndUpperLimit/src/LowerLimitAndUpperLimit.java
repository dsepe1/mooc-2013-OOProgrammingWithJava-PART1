
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the second number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        while (firstNum <= secondNum) {
            System.out.println(firstNum);
            firstNum++;
        }

    }
}
