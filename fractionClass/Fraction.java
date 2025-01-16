
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
        numerator = (int)(Math.random()*20+1);
        denominator = (int)(Math.random()*20+1);
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

    public int toPercent() {
        return (int)(toDouble()*100+0.5);
    }
    
    public void reduce() {
        if (numerator != 0) {
            int GCF = greatestCommonFactor(numerator, denominator);
            numerator /= GCF;
            denominator /= GCF;
        } else {
            denominator = 1;
        }
    }
    
    public boolean equals(Fraction external) {
        return (external.numerator == numerator) && (external.denominator == denominator || numerator == 0);
    }
    
    private void simplifyNegative() {
        boolean neg = numerator*denominator < 0;    
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        if (neg) numerator = numerator * -1;
    }

    public void setNum(int n) {
        numerator =  n;
        simplifyNegative();
        //reduce();
    }

    public void setDenom(int d) {
        checkZero(d);
        denominator = d;
        simplifyNegative();
        //reduce();
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum()*b.getNum();
        int d = a.getDenom()*b.getDenom();
        Fraction ans = new Fraction(n, d);
        ans.simplifyNegative();
        ans.reduce();
        return ans;
    }

    public static Fraction divide(Fraction a, Fraction b) {
        Fraction inverse = new Fraction(b.getDenom(), b.getNum());
        return mult(a, inverse);
    }

    public static Fraction add(Fraction a, Fraction b) {
        int commonD = a.getDenom()*b.getDenom();
        int aNum = (a.getNum()*commonD/a.getDenom());
        int bNum = (b.getNum()*commonD/b.getDenom());
        Fraction ans = new Fraction(aNum+bNum, commonD);
        ans.reduce();
        return ans;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction negB = new Fraction(b);
        negB.setNum(b.getNum()*-1);
        return add(a, negB);
    }

    //borcken if num is 0
    private static int greatestCommonFactor(int a, int b) {
        a = Math.abs(a);
        if(a == b) return a;
        int smallest = Math.min(a, b);
        int remainder = Math.abs(a - b);
        return greatestCommonFactor(smallest, remainder);
    }

    void checkZero(int n) throws ArithmeticException {
        if (n == 0) throw new ArithmeticException("Undefined Value");
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

}
