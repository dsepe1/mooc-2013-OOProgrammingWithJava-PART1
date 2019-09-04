
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.print("Guess a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int guessCount = 0;
        
        while (number != numberDrawn) {
            if (number < numberDrawn) {
                guessCount++;
                System.out.println("The number is greater, guesses made: " + guessCount);
                System.out.print("Guess a number: ");
                number = Integer.parseInt(reader.nextLine());
            } else if (number > numberDrawn) {
                guessCount++;
                System.out.println("The number is lesser, guesses made: " + guessCount);
                System.out.print("Guess a number: ");
                number = Integer.parseInt(reader.nextLine());
            } else {
                break;
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
