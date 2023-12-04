
package javaabstractclass;


public class Square extends Figure {
    
    private double side;

    //Empty Builder
    public Square() {
    }
    
    //Builder
    public Square(double side, double x, double y) {
        super(x, y);
        this.side = side;
    }
    
    /*Override means overwrite. This is the abstract superclass method overwrite,
    but here we are gonna make it own for square */
    @Override
    public double calculateArea() {
        double area = side*side;
        return area;
    }
    
}
