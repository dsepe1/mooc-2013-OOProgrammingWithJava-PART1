import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nameLength = name.length();
        System.out.print("In reverse order: ");
        while (nameLength > 0) {
            char Char = name.charAt(nameLength - 1);
            System.out.print(Char);
            nameLength--;
        }
        System.out.println("");
    }
}
