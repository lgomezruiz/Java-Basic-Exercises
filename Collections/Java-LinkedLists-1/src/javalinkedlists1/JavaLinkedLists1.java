
package javalinkedlists1;

import java.util.LinkedList;
import java.util.List;

public class JavaLinkedLists1 {
    
    public static void main(String[] args) {
        
        //ArrayList for save diferents persons
        List <Person> list = new LinkedList<Person> ();
        list.add(new Person(1, "Laura", 25));
        list.add(new Person(2, "Antonio", 30));
        list.add(new Person(3, "Miguel", 27));
        list.add(new Person(4, "Sandra", 19));
        
        //Add element at the beginning of the LinkedList
        list.add(0, new Person(5, "Juan", 98));
        
        //Loop list by index
        /*Linkedlists do not have a well-defined index, so we cannot use the 
        normal "for" loop. They are designed to be traversed element by element, 
        so we use the "foreach" loop. */
        
        //Loop foreach
        System.out.println("----- FOREACH -----");
        for (Person person:list) {
            System.out.println("Test: " + person.getName());
        }
        
    }
    
}
