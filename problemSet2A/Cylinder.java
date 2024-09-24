/**
 * Naomi Wolfman
 * sept. 24 2024
 * problem set 2a
 */

public class Cylinder {
    double height;
    Circle base;

    Cylinder() {
        height = 1;
        base = new Circle ();
    }

    Cylinder(double R, double H) {
        height = H;
        base = new Circle (R);
    }

    public String toString() {
        return "Hello, I am a Cylinder with a radius of " + getRadius() + " and height of " + height + ".";
    }

    public double getRadius() {
        double radius = base.getRadius();
        return radius;
    }

    public double getHeight() {
        return height;
    }
    
    public double surfaceArea() {
        double surfaceArea = (base.circumference() * getHeight() + 2 * (base.area()));
        return surfaceArea;
    }
    
    public double volume() {
        double volume = base.area() * height;
        return volume;
    }
}