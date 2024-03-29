
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE
        System.out.println("Type a command:");
        String command = reader.nextLine();
        
        while (hangman.gameOn()) {
            
            if (command.equals("quit")) {
                break;
            } else if (command.equals("status")) {
                hangman.printStatus();
                System.out.println("Type a command:");
                command = reader.nextLine();
            } else if (command.length() == 1) {
                hangman.guess(command);
                System.out.println("Type a command:");
                command = reader.nextLine();
            } else if (command.isEmpty()) {
                printMenu();
                System.out.println("Type a command:");
                command = reader.nextLine();
            } else {
                System.out.println("Type a command:");
                command = reader.nextLine();
            }
            hangman.printMan();
            hangman.printWord();
        }


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
