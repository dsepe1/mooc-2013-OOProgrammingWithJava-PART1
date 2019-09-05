public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);
        Counter counter3 = new Counter(true);
        Counter counter4 = new Counter(10, false);
        Counter counter5 = new Counter(2, true);
        
        System.out.println("counter1 initial value: " + counter1.value());
        System.out.println("counter2 initial value: " + counter2.value());
        System.out.println("counter3 initial value: " + counter3.value());
        System.out.println("counter4 initial value: " + counter4.value());
        
        System.out.println("");
        
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.decrease();
        System.out.println("counter2 value: " + counter2.value());
        counter2.increase();
        System.out.println("counter2 value: " + counter2.value());
        
        System.out.println("");
        
        counter1.increase();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.increase();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.decrease();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.decrease();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.decrease();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.increase();
        System.out.println("counter1 value: " + counter1.value());
        
        counter1.increase();
        System.out.println("counter1 value: " + counter1.value());
        
        System.out.println("");
        
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.decrease();
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.increase();
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.increase(10);
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.increase(-5);
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.decrease(10);
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.decrease(-5);
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.decrease(5);
        System.out.println("counter3 value: " + counter3.value());
        
        counter3.increase(10);
        System.out.println("counter3 value: " + counter3.value());
        
        System.out.println("");
        
        System.out.println("counter4 value: " + counter4.value());
        counter4.decrease(11);
        System.out.println("counter4 value: " + counter4.value());
        System.out.println("");
        
        System.out.println("counter5 value: " + counter5.value());
        counter5.decrease(3);
        System.out.println("counter5 value: " + counter5.value());
    }
}
