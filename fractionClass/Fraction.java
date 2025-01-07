
/**
Naomi wolfman
problem set 5a
1/7/2025    
 */
public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    
    public Fraction(int n, int d) {
        checkZero(d);
        numerator = n;
        denominator = d;
    }
    
    public Fraction(String frac) {
        int index = frac.indexOf("/");
        numerator = Integer.valueOf(frac.substring(0, index));
        denominator = Integer.valueOf(frac.substring(index+1));
        checkZero(denominator);
    }
    
    public Fraction(Fraction myFraction) {
        numerator = myFraction.numerator;
        denominator = myFraction.denominator;
    }
    
    void checkZero(int n) throws ArithmeticException {
        if (n == 0) throw new ArithmeticException("Undefined Value");
    }
    
    public int getNum() {
        return numerator;
    }
}
