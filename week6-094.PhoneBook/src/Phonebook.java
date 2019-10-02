/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.list.add(person);
    }
    
    public void printAll() {
        for (Person person : this.list) {
            System.out.println( person );
        }
    }
    
}
