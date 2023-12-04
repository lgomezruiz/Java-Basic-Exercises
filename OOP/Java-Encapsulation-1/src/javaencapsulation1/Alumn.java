
package javaencapsulation1;


public class Alumn {
    
    //Attributes
    /* Note: by standards, all the attributes of a class have to be "private" */
    private int id;
    private String name, lastName;
    
    //Empty Builder
    public Alumn() {
    }
    
    //Builder
    public Alumn(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
