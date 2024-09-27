
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

}
