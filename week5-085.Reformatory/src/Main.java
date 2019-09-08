
public class Main {

    public static void main(String[] args) {
        // write here test code 
        Reformatory reform1 = new Reformatory();
        
        Person andy = new Person("Andy", 25, 180, 95);
        Person carmen = new Person("Carmen", 27, 150, 75);
        
        // Calling weight method here
        System.out.println(andy.getName() + " weight: " + reform1.weight(andy) + " kilos");
        
        reform1.feed(andy);
        reform1.feed(andy);
        // Calling weight method here #2
        System.out.println(andy.getName() + " weight: " + reform1.weight(andy) + " kilos");
        
        // Calling weight method here #3
        reform1.weight(andy);
        System.out.println("total weights measured: " + reform1.totalWeightsMeasured());
        
        reform1.weight(carmen);
        reform1.feed(carmen);
        // Getting Carmen's weight here without calling the weight method
        System.out.println(carmen.getName() + " weight: " + carmen.getWeight());
        System.out.println("total weights measured: " + reform1.totalWeightsMeasured());
    }
}
