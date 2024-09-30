
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
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + Formulas.findQuadRoots(a, b, c) + ".");

        System.out.println(" ");

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
        System.out.println("A line between "+ A +" and "+ B +" has a slope of " + Formulas.findSlope(A, B) + ".");

        System.out.println(" ");

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
        System.out.println("The midpoint between ("+ x1 +","+ y1 +" ) and ("+ x2 +", "+ y2 +") is "+ Formulas.findMidpoint(A, B) + ".");
         */
        System.out.println(" ");

        int k;
        double a, d;
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Increases by: ");
        d = input.nextDouble();
        System.out.println("The sum of the first "+ k +" terms of an arithmetic series that starts with "+ a +" and increases by "+ d +" is " + Formulas.findArithmeticSeriesSum(a, d, k) + ".");

        System.out.println(" ");

        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Rate of growth: ");
        d = input.nextDouble();
        System.out.println("The sum of the first "+ k +" terms of a finite geometric series that starts with "+ a +" and increases by a rate of "+ d +" is " + Formulas.findGeometricSeriesSum(a, d, k) + ".");

        System.out.println(" ");
        
        int n;
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        n = input.nextInt();
        System.out.println("Rolling a 20-sided die... you got a "+ Formulas.rollDie(n) +"!");

        input.close();
    }
}
