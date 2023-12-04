
package javainheritance1;

// "Extends" is a keywork to relate Employee with Person (superclass)
public class Employee extends Person {
    
    /* Note: Employee inherits Person's parameters */
    
    //Own parameters of Employee
    int numFile;
    String position;
    double salary;
    
    //Empty Builder
    public Employee() {
    }
    
    //Builder
    /*  Note: "super" is a keyword that call the superclass builder */
    public Employee(int numFile, String position, double salary, int id, String dni, String name, String lastName, String home, String phone) {
        super(id, dni, name, lastName, home, phone);
        this.numFile = numFile;
        this.position = position;
        this.salary = salary;
    }
    
    //Getters & Setters
    /* Note: is not necessary write the getters and setters methods of superclass
        because they are already at the Person class */
    
    public int getNumFile() {
        return numFile;
    }

    public void setNumFile(int numFile) {
        this.numFile = numFile;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
}
