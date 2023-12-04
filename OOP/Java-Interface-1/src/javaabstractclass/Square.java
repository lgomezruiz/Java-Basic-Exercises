
package javaabstractclass;


public class Square implements Figure, Drawable {
    
    private double side;

    //Empty Builder
    public Square() {
    }
    
    //Builder

    public Square(double side) {
        this.side = side;
    }
    
    /*Override means overwrite. This is the abstract superclass method overwrite,
    but here we are gonna make it own for square */
    @Override
    public double calculateArea() {
        double area = side*side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Hello, I'm drawing a square");
    }
    
}
