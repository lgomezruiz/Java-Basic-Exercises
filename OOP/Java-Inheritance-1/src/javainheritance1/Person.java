
package javainheritance1;

public class Person {
    
    int id;
    String dni, name, lastName, home, phone;
    
    //Empty Builder
    public Person (){
        
    }

    public Person(int id, String dni, String name, String lastName, String home, String phone) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.home = home;
        this.phone = phone;
    }
    
    //Getters
    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHome() {
        return home;
    }

    public String getPhone() {
        return phone;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}

