
/**
Naomi wolfman
problem set 5a
1/7/2025    
 */

import java.util.ArrayList;

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
        setDenom(d);
    }

    public Fraction(String frac) {
        int index = frac.indexOf("/");
        numerator = Integer.valueOf(frac.substring(0, index));
        setDenom(Integer.valueOf(frac.substring(index+1)));
        checkZero(denominator);
    }

    public Fraction(Fraction myFraction) {
        numerator = myFraction.numerator;
        denominator = myFraction.denominator;
    }

    public int getNum() {
        return numerator;
    }
    
    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator+"/"+denominator;
    }

    public double toDouble() {
        return (double)numerator/denominator;
    }
    
    public void reduce() {
        int GCF = greatestCommonFactor(numerator, denominator);
        numerator /= GCF;
        denominator /= GCF;
    }
    
    /*
    public void reduce() {
        ArrayList<Integer> primes = primeList(Math.min(numerator, denominator));
        int i = 0;
        while (i < primes.size()) {
            int val = primes.get(i);
            while (numerator % val == 0 && denominator % val == 0) {
                numerator = numerator / val;
                denominator = denominator / val;
            }
            if (val > denominator || val > numerator) break;
            i++;
        }
    }

    public static ArrayList<Integer> primeList(int n){
        ArrayList<Integer> ans = new ArrayList();
        for (int i = 2; i <= n; i++) {
            ans.add(i);
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = i+1; j < ans.size(); j++) {
                if (ans.get(j) % ans.get(i) == 0) {
                    ans.remove(j);
                    j--;
                }
            }
        }
        return ans;
    }
*/


    public void setNum(int n) {
        numerator =  n;    
    }

    public void setDenom(int d) {
        checkZero(d);
        denominator = d;
    }
    
    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum()*b.getNum();
        int d = a.getDenom()*b.getDenom();
        Fraction ans = new Fraction(n, d);
        return ans;
    }
    
    public static Fraction divide(Fraction aNum, Fraction bDen) {
        int n = aNum.getNum()*bDen.getDenom();
        int d = aNum.getDenom()*bDen.getNum();
        Fraction ans = new Fraction(n, d);
        return ans;
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction aD = new Fraction(a.getDenom(), a.getDenom());
        Fraction bD = new Fraction(b.getDenom(), b.getDenom());
        Fraction ans = new Fraction(mult(a, bD), );
    }
    
    private static int greatestCommonFactor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == b) return a;
        int smallest = Math.min(a, b);
        int remainder = Math.abs(a - b);
        return greatestCommonFactor(smallest, remainder);
    }
    
        void checkZero(int n) throws ArithmeticException {
        if (n == 0) throw new ArithmeticException("Undefined Value");
    }
    
}
