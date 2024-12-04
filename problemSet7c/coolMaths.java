/**
 * Naomi Wolfman
 * problem set 7c
 * dec. 3 2024
 */

import java.util.ArrayList;

public class coolMaths
{


    public coolMaths()
    {
    }

    public static ArrayList<Integer> sieveOfEratosthenes(int n)
    {
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
    
    public static void goldbachConjecture(int n) {
        ArrayList<Integer> options = sieveOfEratosthenes(n);
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < options.size(); i++) {
            for (int j = i; j < options.size(); j++) {
                if (options.get(i)+options.get(j) == n) {
                    num1 = options.get(j);
                    num2 = options.get(i);
                    break;
                }
            }
            if (num1 + num2 == n) break;
        }
        System.out.println(num1 + "+" + num2 + " = " + n);
    }
    
    public static ArrayList<Integer> addingBigInts(int a, int b) {
        // i get you would input them as lists as well but i dont wanna do that to myself while tesing
        ArrayList<Integer> aList = makeBigInt(a);
        ArrayList<Integer> bList = makeBigInt(b);
        ArrayList<Integer> ans = new ArrayList();
        boolean carry = false;
        for (int i = 0; i < aList.size() || i < bList.size(); i++) {
            int digit = 0;
            if (carry) digit++;
            if (i < aList.size()) digit += aList.get(aList.size() - i - 1);
            if (i < bList.size()) digit += bList.get(bList.size() - i - 1);
            carry = digit/10 >= 1;
            digit = digit%10;
            ans.add(0, digit);
        }
        if (carry) ans.add(0, 1);
        return ans;
    }
    
    public static ArrayList<Integer> makeBigInt(int a) {
        ArrayList<Integer> bigInt = new ArrayList();
        while (a > 0) {
            bigInt.add(0, a % 10);
            a = a/10;
        }

        return bigInt;
    }
    
}
