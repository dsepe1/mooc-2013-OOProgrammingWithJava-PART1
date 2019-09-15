
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println( pekka );
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> list = new ArrayList<Student>();
        
        String name = " ";
        String studentNumber = "";
        System.out.print("name: ");
        name = reader.nextLine();
        
        while (!name.equals("")) {
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            Student student = new Student(name, studentNumber);
            list.add(student);
            System.out.print("name: ");
            name = reader.nextLine();
        }
        
        System.out.println("");
        
        for ( Student student : list ) {
            System.out.println( student );
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String searched = reader.nextLine();
        System.out.println("Result:");
        for ( Student student : list ) {
            if (student.getName().contains(searched)) {
                System.out.println( student );
            }
        }
        
    }
}
