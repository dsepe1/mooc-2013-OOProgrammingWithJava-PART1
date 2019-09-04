import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int count = 0;
        double avg = 0;
        int evenN = 0;
        int oddN = 0;
        
        while (num != -1) {
            if (num % 2 == 0) {
                evenN++;
            } else {
                oddN++;
            }
            sum += num;
            num = Integer.parseInt(reader.nextLine());
            count++;
            avg = (double)sum / count;
        }
//        avg = (double)sum / count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("EVen numbers: " + evenN);
        System.out.println("Odd numbers: " + oddN);
    }
}
