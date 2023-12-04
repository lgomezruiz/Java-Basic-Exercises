
package javaplants1;

public class Tree extends Plant {
    
    //Attributes
    private String variety, trunkType, color, leavesType;
    private double trunkRadius;

    //Empty Builder
    public Tree() {
    }
    
    //Builder
    public Tree(String variety, String trunkType, String colour, String leavesType, double trunkRadius, String name, String idealClimate, double stemHeight, boolean hasLeaves) {
        super(name, idealClimate, stemHeight, hasLeaves);
        this.variety = variety;
        this.trunkType = trunkType;
        this.color = color;
        this.leavesType = leavesType;
        this.trunkRadius = trunkRadius;
    }

    //Getters & Setters
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTrunkType() {
        return trunkType;
    }

    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }

    public String getColour() {
        return color;
    }

    public void setColour(String colour) {
        this.color = color;
    }

    public String getLeavesType() {
        return leavesType;
    }

    public void setLeavesType(String leavesType) {
        this.leavesType = leavesType;
    }

    public double getTrunkRadius() {
        return trunkRadius;
    }

    public void setTrunkRadius(double trunkRadius) {
        this.trunkRadius = trunkRadius;
    }
    
    //Methods of Plant
    @Override
    public void sayWhatIAm() {
        System.out.println("Hello! I'm a tree.");
    }
    
}
