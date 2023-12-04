
package javaoop1;


public class OOP {

    
    public static void main(String[] args) {
        
        //Creating two object of Alumn
        Alumn alumn1 = new Alumn ();
        Alumn alumn2 = new Alumn (5, "Antonio", "Lopez");
        
        //Using getter methods to second alumn
        System.out.println("The id of second alumn is " + alumn2.getId());
        System.out.println("The name is " + alumn2.getName());
        System.out.println("The last name is " + alumn2.getLastName());
        
        //Using setter methods to first alumn
        alumn1.setId(8);
        alumn1.setName("John");
        alumn1.setLastName("Wick");
        
        //Using getter methods to first alumn
        System.out.println("The id of first alumn is " + alumn1.getId());
        System.out.println("The name is " + alumn1.getName());
        System.out.println("The last name is " + alumn1.getLastName());
        
        //Using setter methods to change second alumn data
        alumn2.setId(35);
        
    }
    
}
