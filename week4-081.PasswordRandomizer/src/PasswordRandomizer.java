import java.util.Random;

public class PasswordRandomizer {
    private String password;
    private int passwordLength;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {
        int number = this.random.nextInt(26);
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        
        int i = 0;
        String help = "";
        while (i < this.passwordLength) {
            help = help + symbol;
            i++;
            number = this.random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        }
        this.password = help;
        return this.password;
    }
}
