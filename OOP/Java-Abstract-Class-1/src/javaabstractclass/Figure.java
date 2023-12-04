
package javaabstractclass;


public abstract class Figure {
    protected double x; //X position
    protected double y; //Y position

    //Empty Builder
    protected Figure() {
    }
    
    //Builder
    protected Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Abstract Method, for both types of figures (square and circle)
    public abstract double calculateArea();
}
