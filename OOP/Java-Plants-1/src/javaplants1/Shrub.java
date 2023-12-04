
package javaplants1;

public class Shrub extends Plant {

    //Attributes
    private double wide;
    private boolean isDomestic, isPruned;
    private String variety, leafColor;

    //Empty Builder
    public Shrub() {
    }

    //Builder
    public Shrub(double wide, boolean isDomestic, boolean isPruned, String variety, String leafColor, String name, String idealClimate, double stemHeight, boolean hasLeaves) {
        super(name, idealClimate, stemHeight, hasLeaves);
        this.wide = wide;
        this.isDomestic = isDomestic;
        this.isPruned = isPruned;
        this.variety = variety;
        this.leafColor = leafColor;
    }

    //Getters & Setters
    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public boolean isIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public boolean isIsPruned() {
        return isPruned;
    }

    public void setIsPruned(boolean isPruned) {
        this.isPruned = isPruned;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
    
    //Methods of Plant
    @Override
    public void sayWhatIAm() {
        System.out.println("Hello! I'm a shrub.");
    }
    
}
