
package javaabstractclass;


public class Circle implements Figure, Rotable, Drawable {
    
    private double radius;

    //Empty Builder
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
    }

    @Override
    public void rotate() {
        System.out.println("Hello, I'm rotating a circle");
    }

    @Override
    public void draw() {
        System.out.println("Hello, I'm drawing a circle");
    }
}
    

