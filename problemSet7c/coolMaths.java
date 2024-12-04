import java.util.ArrayList;

public class coolMaths
{


    public coolMaths()
    {
        // initialise instance variables

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
        for (int i )
        
    }
    
    public static ArrayList<Integer> makeBigint(int a) {
        ArrayList<Integer> bigInt = new ArrayList();
        while (a > 0) {
            bigInt.add(bigInt.size(), a%10);
            a = a/10;
        }
        return bigInt;
    }
    
}
