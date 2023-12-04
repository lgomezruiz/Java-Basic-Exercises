
package javainheritance1;

public class Consultant extends Person {
    
    /* Note: Consultant inherits Person's parameters */
    
    //Own parameters of Consultant
    String nameConsultant;
    int numConsultant;
    
    //Empty Builder
    public Consultant() {
    }
    
    //Builder
    /*  Note: "super" is a keyword that call the superclass builder */

    public Consultant(String nameConsultant, int numConsultant, int id, String dni, String name, String lastName, String home, String phone) {
        super(id, dni, name, lastName, home, phone);
        this.nameConsultant = nameConsultant;
        this.numConsultant = numConsultant;
    }
    
    //Getters & Setters
    /* Note: is not necessary write the getters and setters methods of superclass
        because they are already at the Person class */
    
    public String getNameConsultant() {
        return nameConsultant;
    }

    public void setNameConsultant(String nameConsultant) {
        this.nameConsultant = nameConsultant;
    }

    public int getNumConsultant() {
        return numConsultant;
    }

    public void setNumConsultant(int numConsultant) {
        this.numConsultant = numConsultant;
    }
    
    
    
    
    
}
