
package javaoop1;


public class Alumn {
    
    //Atributes
    int id;
    String name;
    String lastName;
    
    //Builder empty
    public Alumn () {
        
    }

    //Builder this all parameters
    /* Note: "this" is a keyword that refers local parameters
        of this object, no global parameters */
    public Alumn(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    
    //Getters: get data

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    //Setters: edit data
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    //Method
    public void showName() {
        System.out.println("Hello, I'm an alumn and "
                + "I know how to say my name");
    }
    
    //Method
    public void knowApproved (double qualification) {
        if (qualification >= 5) {
            System.out.println("I approved the subject");
        }
        else  {
            System.out.println("I didn't approve the subject");
        }
        
    }
    
}
