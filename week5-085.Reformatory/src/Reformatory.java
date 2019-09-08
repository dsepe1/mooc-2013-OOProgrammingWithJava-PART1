public class Reformatory {
    private int count = 0;
    

    public int weight(Person person) {
        // return the weight of the person
        this.count++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        this.count--; // Must negate the count here every time weight method is called by feed method
        person.setWeight(this.weight(person) + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.count;
    }

}
