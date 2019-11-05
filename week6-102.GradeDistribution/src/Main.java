import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes:");
        int grade = Integer.parseInt(reader.nextLine());
        while (grade != -1) {
            grades.add(grade);
            grade = Integer.parseInt(reader.nextLine());
        }
        System.out.println(grades);
        System.out.println("Test done.");
        
    }
    
    public static void addGrades(Scanner scanner) {
        String riw = scanner.nextLine();
    }
}
