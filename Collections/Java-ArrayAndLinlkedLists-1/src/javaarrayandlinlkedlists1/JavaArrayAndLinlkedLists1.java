
package javaarrayandlinlkedlists1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaArrayAndLinlkedLists1 {

    public static void main(String[] args) {
        
        //ArrayList for save diferents persons
        ArrayList <Person> arrayList = new ArrayList<Person> ();
        arrayList.add(new Person(1, "Laura", 25));
        arrayList.add(new Person(2, "Antonio", 30));
        arrayList.add(new Person(3, "Miguel", 27));
        arrayList.add(new Person(4, "Sandra", 19));
        
        //ArrayList for save diferents persons
        LinkedList <Person> linkedList = new LinkedList<Person> ();
        linkedList.add(new Person(1, "Laura", 25));
        linkedList.add(new Person(2, "Antonio", 30));
        linkedList.add(new Person(3, "Miguel", 27));
        linkedList.add(new Person(4, "Sandra", 19));
        
        System.out.println("ARRAY LIST");
        for (Person person : arrayList) {
            System.out.println(person.getName());
        }
        System.out.println("");
        System.out.println("LINKED LIST");
        for (Person person : linkedList) {
            System.out.println(person.getName());
        }
        
        //Remove ArrayList
        arrayList.remove(1);
        
        //Remove LinkedList
        for (Person persona2 : linkedList) {
            if (persona2.getName() == "Antonio") {
                linkedList.remove(persona2);
                break;
            }
        }
        System.out.println("");
        System.out.println("--- AFTER REMOVE ---");
        System.out.println("ARRAY LIST");
        for (Person person : arrayList) {
            System.out.println(person.getName());
        }
        System.out.println("");
        System.out.println("LINKED LIST");
        for (Person person : linkedList) {
            System.out.println(person.getName());
        }
        
        //List Side
        System.out.println("");
        System.out.println("LIST SIDE");
        System.out.println("Arraylist Side: " + arrayList.size());
        System.out.println("Linkedlist Side: " + linkedList.size());
        System.out.println("");
        
        //First And Last Object(only Linkedlist)
        System.out.println("First Arraylist Element: " + linkedList.getFirst().toString());
        System.out.println("Last Arraylist Element: " + linkedList.getLast().toString());
        System.out.println("");
        
        //Clear list
        arrayList.clear();
        linkedList.clear();
        System.out.println("");
        
        //Check if the list is empty
        System.out.println("THE LIST IS EMPTY?");
        System.out.println("Arraylist: " + arrayList.isEmpty());
        System.out.println("Arraylist: " + linkedList.isEmpty());
        
    }
    
}
