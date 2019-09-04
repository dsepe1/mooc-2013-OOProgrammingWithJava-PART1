
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            
            if (temp < -30 || temp > 40) {
                System.out.println("Please enter a temperature between -30 and 40.");
            } else {
                Graph.addNumber(temp);
                System.out.println("Want to add another temperature? ('Yes' or 'No')?");
                String response = reader.nextLine();
                    if (response.equals("No")) {
                        break;
                    }
            }
        }
        System.out.println("Completed!");
        
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
