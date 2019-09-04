import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String word = " ";
        while (!word.equals("")) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        
        Collections.reverse(words);
        
        for (String typedWords : words) {
            System.out.println( typedWords );
        }
    }
}
