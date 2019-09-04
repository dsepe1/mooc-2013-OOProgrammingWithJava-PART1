import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int endLength = Integer.parseInt(reader.nextLine());
        System.out.print("Result: ");
        
        System.out.println(word.substring(word.length() - endLength));
                
        // Daniel, word.length() = 6
        // Length of end part input = 5
        // output should be aniel (starting at index 1)
        // That means substring(word.length() - inputLength)
        // This should print out aniel
    }
}
