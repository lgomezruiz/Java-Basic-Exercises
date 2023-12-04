
package javaplants1;

public class Flower  extends Plant {

    //Attributes
    private String petalColor, pistilColor, variety, bloomSeason;
    private int petalsNum;

    //Empty Builder
    public Flower() {
    }

    //Builder
    public Flower(String petalColor, String pistilColor, String variety, String bloomSeason, int petalsNum, String name, String idealClimate, double stemHeight, boolean hasLeaves) {
        super(name, idealClimate, stemHeight, hasLeaves);
        this.petalColor = petalColor;
        this.pistilColor = pistilColor;
        this.variety = variety;
        this.bloomSeason = bloomSeason;
        this.petalsNum = petalsNum;
    }

    //Getters & Setters
    public String getPetalColor() {
        return petalColor;
    }

    public void setPetalColor(String petalColor) {
        this.petalColor = petalColor;
    }

    public String getPistilColor() {
        return pistilColor;
    }

    public void setPistilColor(String pistilColor) {
        this.pistilColor = pistilColor;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getBloomSeason() {
        return bloomSeason;
    }

    public void setBloomSeason(String bloomSeason) {
        this.bloomSeason = bloomSeason;
    }

    public int getPetalsNum() {
        return petalsNum;
    }

    public void setPetalsNum(int petalsNum) {
        this.petalsNum = petalsNum;
    }
    
    //Methods of Plant
    @Override
    public void sayWhatIAm() {
        System.out.println("Hello! I'm a flower.");
    }
    
}
