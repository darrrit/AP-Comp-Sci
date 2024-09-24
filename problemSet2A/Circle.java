/**
 * Naomi Wolfman
 * Sept. 23, 2024
 * problem set 2a
 */

public class Circle {

    double radius;
    Circle() {
        radius = 1;
    }
    
    Circle(double r) {
        radius = r;
    }
    // makes thing actual string get returned not reference
    // automatically gets called any time a string is expected from circle
    //
    
    public String toString() {
        return "Hello, I am a circle with a raduis of " + radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double circumference() {
        double circumference = Math.PI * 2 * radius;
        return circumference;
    }
    
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

