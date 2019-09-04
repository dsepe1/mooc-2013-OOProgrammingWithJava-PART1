
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        
        // Do this exercise require the use of the substring method?
        String help = "";
        int i = text.length();
        while (i > 0) {
            help = help + text.charAt(i - 1);
            i--;
        }
        return help;
        
        // D a n i e l
        // 0 1 2 3 4 5
        // text.length() = 6
        // i = 6, prints l
        // i = 4, adds letter e => le
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
