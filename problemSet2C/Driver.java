
/**
 * Naomi Wolfman
 * sept.27 2024
 * problem set 2c
 */
import java.util.Scanner;
public class Driver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
    /*
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c: ");
        double a, b, c;
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("b: ");
        b = input.nextDouble();
        System.out.print("c: ");
        c = input.nextDouble();
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + Formulas.findQuadRoots(a, b, c));
    */
        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        double x1, x2, y1, y2;
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        OrderedPair A = new OrderedPair(x1, y1);
        OrderedPair B = new OrderedPair(x2, y2);
        System.out.print("A line between "+ A +" and "+ B +" has a slope of " + Formulas.findSlope(A, B));
        
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        A = new OrderedPair(x1, y1);
        B = new OrderedPair(x2, y2);
        System.out.print("The midpoint between ("+ x1 +","+ y1 +" ) and ("+ x2 +", "+ y2 +") is ("+ Formulas.findMidpoint() +")");
        input.close();
    }
}
