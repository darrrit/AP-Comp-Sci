
/**
 * Write a description of class OrderedPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPair {
    double X, Y;
    public OrderedPair() {
        X = Y = 0;
    }

    public OrderedPair(double tx, double ty) {
        X = tx;
        Y = ty;
    }

    public String toString() {
        return "("+ X +", "+ Y +")";
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }
    
    
}

