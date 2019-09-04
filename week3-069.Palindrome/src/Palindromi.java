import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String help = "";
        int i = text.length();
        while (i > 0) {
            help = help + text.charAt(i - 1);
            i--;
        }
        if (text.equals(help)) {
            return true;
        }
        return false;
        // text = Daniel
        // D a n i e l
        // 0 1 2 3 4 5
        // i = 6, help = l
        // i = 5, help = le
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
