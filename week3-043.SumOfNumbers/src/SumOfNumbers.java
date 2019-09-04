public class SumOfNumbers {
    
    //Method 1
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }
    
    //Method 2
//    public static void sumAnotherWay(int one, int two, int three, int four) {
//        int sum = one + two + three + four;
//        System.out.println("Sum by Method #2 is " + sum);
//    }

    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
        
//        sumAnotherWay(4, 3, 6, 1);
    }
}
