//import java.util.ArrayList;

public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters = this.guessedLetters + letter;
        }
        if (!this.word.contains(letter)) {
            this.numberOfFaults++;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed letters, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
//        ArrayList<String> letterList = new ArrayList<String>();
//        letterList.add(this.word);
//        
//        for ( String word : letterList) {
//            
//        }
        String hiddenWord = "";
        
        int i = 0;
        while (i < this.word.length()) {
            hiddenWord = hiddenWord + this.word.charAt(i);
            i++;
        }
        
        char c = ;
        String aString = "" + c;
        if (hiddenWord.contains(this.guessedLetters)) {
            
        }
            
        return hiddenWord;
    }
}
