/** 
 * Naomi Wolfman
 * sept. 24 2024
 * problem set 2a
 */

public class Driver {
    public static void main (String[] args) {

        Cylinder defaultC = new Cylinder();
        Cylinder customC = new Cylinder(5, 10);
        printCylinder(defaultC);
        System.out.println("");
        printCylinder(customC);
        
    }
    
    public static void printCylinder(Cylinder C) {
        if (C.getRadius() == 1.0) {
            System.out.println("Creating a cylinder with the default constructor!");
        } else {
            System.out.println("Creating a cylinder with the parameterized constructor!");
        }
        System.out.println(C);
        System.out.println("getRadius() --> "+ C.getRadius() +" units");
        System.out.println("getHeight() --> " + C.getHeight() + " units");
        System.out.println("surfaceArea() --> " + C.surfaceArea() + " units^2");
        System.out.println("volume() -->" + C.volume() + " units^3");
    }
}

