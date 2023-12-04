
package javainheritance1;

public class Boss extends Person {
    
    //Own parameters
    int idBoss;
    String bossDeparment;
    
    //Empty Builder
    public Boss() {
    }
    
    //Builder
    public Boss(int idBoss, String bossDeparment, int id, String dni, String name, String lastName, String home, String phone) {
        super(id, dni, name, lastName, home, phone);
        this.idBoss = idBoss;
        this.bossDeparment = bossDeparment;
    }
    
    //Getters & Setters
    public int getIdBoss() {
        return idBoss;
    }

    public void setIdBoss(int idBoss) {
        this.idBoss = idBoss;
    }

    public String getBossDeparment() {
        return bossDeparment;
    }

    public void setBossDeparment(String bossDeparment) {
        this.bossDeparment = bossDeparment;
    }
    
    
}
