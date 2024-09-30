
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas
{
    public static OrderedPair findQuadRoots (double a, double b, double c) {
        double sqrtPart = Math.sqrt(b*b-4*a*c);
        double ans1 = (-b+sqrtPart)/(2*a);
        double ans2 = (-b-sqrtPart)/(2*a);
        OrderedPair ans = new OrderedPair(ans1, ans2);
        return ans;
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B) {
        double top = A.Y - B.Y;
        double keira = A.X - B.X;
        double slope = top/keira;
        return slope;
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double top = (A.X + B.X)/2;
        double keira = (A.Y + B.Y)/2;
        OrderedPair ans = new OrderedPair(top, keira);
        return ans;
    }

    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double sum  = (k/2.0)*(2*a + d*(k-1));
        return sum;
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        double sum = a*((1-Math.pow(r, k))/(1-r));
        return sum;
    }
    
    public static int rollDie (int n) {
        double base = Math.random();
        int roll = (int) ((base * n) + 1);
        return roll;
    }
}
