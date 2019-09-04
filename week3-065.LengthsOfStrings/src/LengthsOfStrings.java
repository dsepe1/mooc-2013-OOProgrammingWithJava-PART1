import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        // need to store the String lengths into a new ArrayList<Integer>
        ArrayList<Integer> lengthList = new ArrayList<Integer>(); // That's why this was created
        for (String word : list) {
            lengthList.add(word.length());
        }
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
