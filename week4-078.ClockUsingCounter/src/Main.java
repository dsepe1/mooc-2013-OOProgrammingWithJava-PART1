
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
//        System.out.print("seconds: ");
//        int s = Integer.parseInt(reader.nextLine());
//        System.out.print("minutes: ");
//        int m = Integer.parseInt(reader.nextLine());
//        System.out.print("hours: ");
//        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);
        
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
        }
        
//        for (int i = 0; i < 121; i++) {
//            System.out.println(hours + ":" + minutes + ":" + seconds);
//            seconds.next();
//            if (seconds.getValue() == 0) {
//                minutes.next();
//                if (minutes.getValue() == 00) {
//                    hours.next();
//                }
//            }
//        }
        
//        for (int i = 0; i < 16; i++) {
//            counter.next(); // Checks to increase value before it prints value
//            // At value = 3, value will be increased to 4
//            System.out.println("Value: " + counter); // It will print value = 4 here
//        }
    }
}
