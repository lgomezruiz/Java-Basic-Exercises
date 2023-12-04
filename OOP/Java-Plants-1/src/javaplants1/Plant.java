
package javaplants1;


public abstract class Plant {
    
    //Attributes
    private String name, idealClimate;
    private double stemHeight;
    private boolean hasLeaves;
    
    //Empty Builder
    public Plant() {
    }
    
    //Builder
    public Plant(String name, String idealClimate, double stemHeight, boolean hasLeaves) {
        this.name = name;
        this.idealClimate = idealClimate;
        this.stemHeight = stemHeight;
        this.hasLeaves = hasLeaves;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdealClimate() {
        return idealClimate;
    }

    public void setIdealClimate(String idealClimate) {
        this.idealClimate = idealClimate;
    }

    public double getStemHeight() {
        return stemHeight;
    }

    public void setStemHeight(double stemHeight) {
        this.stemHeight = stemHeight;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public abstract void sayWhatIAm();
    
    
    
}
