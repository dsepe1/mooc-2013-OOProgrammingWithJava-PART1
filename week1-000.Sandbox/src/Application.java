// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Random random = new Random();
        
        int number = random.nextInt(26);
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        int passwordLength = 13;
        String password = "";
        
        int i = 0;
        String help = "";
        while (i < passwordLength) {
            help = help + symbol;
            i++;
            number = random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        }
        password = help;
        System.out.println(password);
        
//        String name = "Donna";
//        String where = "Ireland";
//        greet(name, where);
        
//        System.out.println("The result is " + add(2, 2));
//        int someTotal = add(5, 7);
//        System.out.println("Method #1 gives total of " + someTotal);
//        System.out.println("Print this " + add(7, 7));
//        
//        addThisWay(6, 7);
        
//        ArrayList<String> teachers = new ArrayList<String>();
//        
//        teachers.add("Anthony");
//        teachers.add("Paul");
//        
//        for (String person : teachers) {
//            System.out.println(person);
//        }
//        double squared = Math.pow(3, 2);
//        System.out.println("3 squared = " + squared);
    }
    
//    public static void greet(String name, String place) {
//        System.out.println("Hi " + name + " from " + place);
//    }
//    public static int add(int num1, int num2) {
//        int sum = num1 + num2;
//        return sum;
//    }
    
//    public static void addThisWay (int aNumber1, int aNumber2) {
//        double total = aNumber1 + aNumber2;
//        System.out.println("Method #2 (by void) gives a total of " + total);
//    }
}
