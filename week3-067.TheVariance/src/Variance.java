import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double denominator = (list.size() - 1);
        double numeratorTotal = 0;
        for (Integer initial : list) {
            double numerator = Math.pow(initial - average(list), 2);
            numeratorTotal += numerator;
        }
        double variance = numeratorTotal / denominator;
        return variance;
    }
    
//    public static double variance2(ArrayList<Integer> list) {
//        double denominator = (list.size());
//        double numeratorTotal = 0;
//        for (Integer initial : list) {
//            double numerator = Math.pow(initial - average(list), 2);
//            numeratorTotal += numerator;
//        }
//        double variance = numeratorTotal / denominator;
//        return variance;
//    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
//        list.add(1);
        
//        if (list.size() > 2) {
            System.out.println("The variance is: " + variance(list));
//        } else {
//            System.out.println("The variance is: " + variance2(list));
//        }
    }

}
