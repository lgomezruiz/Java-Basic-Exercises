
package javaencapsulation1;


public class JavaEncapsulation1 {

    public static void main(String[] args) {
       
        Alumn alumn1 = new Alumn ();
        Alumn alumn2 = new Alumn (15, "John", "Wick");
        
        System.out.println("id: " + alumn2.getId());
        System.out.println("Name: " + alumn2.getName());
        System.out.println("Last Name: " + alumn2.getLastName());
        
        
    }
    
}
