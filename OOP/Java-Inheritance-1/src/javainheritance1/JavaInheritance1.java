
package javainheritance1;

public class JavaInheritance1 {

    public static void main(String[] args) {
        
        Employee emplo1 = new Employee ();
        
        emplo1.getNumFile();
        emplo1.getName();
        
        Consultant consul1 = new Consultant ();
        
        consul1.getNameConsultant();
        consul1.getNumConsultant();
        
        /* Note: Error because polymorphism allows converting data of 
            the same type, but not different ones like this String */
        Person vector [] = new Person [5];
        vector[0] = new Person ();
        vector[1] = new Employee ();
        vector[2] = new Consultant ();
        vector[3] = new Boss ();
        vector[4] = "Hello";
        
        Person person = new Person ();
        Consultant  consul = new Consultant ();
        
        /* Note: superclass converted to childclass is allowed
                childclass convertedto superclass is not allowed */
  
        person = consul;
        consul = person;
    }
    
}
