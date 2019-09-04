import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
