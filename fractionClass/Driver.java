
public class Driver {
    public static void main(String[] args) {
        estimatePI();
    }
    
    
    private static void estimatePI() {
        Fraction estimate = new Fraction (25, 8);
        Fraction MILU = new Fraction( 355, 113 );
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        while (!(Math.abs( Math.PI - estimate.toDouble() ) < EPSILON)) {
            if (estimate.toDouble()<MILU.toDouble()) estimate.setNum(estimate.getNum()+1);
            else estimate.setDenom(estimate.getDenom()+1);
        }
        System.out.println(estimate);
    }
}


