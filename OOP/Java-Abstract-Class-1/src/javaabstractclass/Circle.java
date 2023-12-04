
package javaabstractclass;


public class Circle extends Figure {
    
    private double radius;

    //Empty Builder
    public Circle() {
    }
    
    //Builder
    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
    }
    
}
