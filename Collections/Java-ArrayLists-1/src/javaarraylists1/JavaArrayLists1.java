
package javaarraylists1;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayLists1 {
    
    public static void main(String[] args) {
        
        //ArrayList for save diferents persons
        List <Person> list = new ArrayList<Person> ();
        list.add(new Person(1, "Laura", 25));
        list.add(new Person(2, "Antonio", 30));
        list.add(new Person(3, "Miguel", 27));
        list.add(new Person(4, "Sandra", 19));
        
        //Loop list by index
        System.out.println("----- FOR -----");
        for (int i=0; i<list.size(); i++) {
            System.out.println("Test: " + list.get(i).getName());
        }
        
        //Loop foreach
        System.out.println("----- FOREACH -----");
        for (Person person:list) {
            System.out.println("Test: " + person.getName());
        }
        
    }
    
}
