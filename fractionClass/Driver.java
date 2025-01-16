import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        game();
    }

    private static void estimatePI() {
        Fraction estimate = new Fraction (355, 113);
        Fraction MILU = new Fraction( 355, 113 );
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        while (!(Math.abs( Math.PI - estimate.toDouble() ) < EPSILON)) {
            if (estimate.toDouble()<Math.PI) estimate.setNum(estimate.getNum()+1);
            else estimate.setDenom(estimate.getDenom()+1);
        }
        System.out.println(estimate);
    }

    private static void game() {
        Scanner input = new Scanner(System.in);
        String playerAns = "";
        Fraction winPercent = new Fraction("-1/1");
        while (!playerAns.equals("quit")) {
            Fraction a = new Fraction();
            Fraction b = new Fraction();
            Fraction ans;
            int operation = (int)(Math.random()*4);
            String operator = "";
            if (operation == 0) {
                operator = "+";
                ans = Fraction.add(a, b);
            } else if (operation == 1) {
                operator = "-";
                ans = Fraction.subtract(a, b);
            } else if (operation == 2) {
                operator = "*";
                ans = Fraction.mult(a, b);
            } else {
                operator = "/";
                ans = Fraction.divide(a, b);
            }
            System.out.print(a + " " + operator + " " + b + " = ");
            playerAns = input.nextLine();
            if (playerAns.equals("quit")) {
                if (winPercent.toDouble() > 0) {
                    System.out.print("Your win/rounds ratio was " + winPercent + ", for a score of " + winPercent.toPercent() + " percent!");
                } else {
                    System.out.print("You give up easy.");
                }
            } else {
                Fraction playerAnsFrac = new Fraction(playerAns);
                if (playerAnsFrac.equals(ans)) {
                    if (winPercent.toDouble() < 0) {
                        winPercent.setNum(1);
                    }   else {
                        winPercent.setNum(winPercent.getNum() + 1);
                    }
                    System.out.println("Correct!");
                } else {
                    if (winPercent.toDouble() < 0) {
                        winPercent.setNum(0);
                    }   else {
                        winPercent.setDenom(winPercent.getDenom() + 1);
                    }
                    System.out.println("Wrong, the answer was " + ans);
                }
            }
        }
    }
}

