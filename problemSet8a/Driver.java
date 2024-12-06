
/**
 * Naomi Wolfman
 * Problem set 8a
 * Dec. 5 2024
 */

import java.util.Scanner;
public class Driver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Grid myGrid = new Grid();
        myGrid.draw();
        int i = 0;
        while (! myGrid.win()) {
            System.out.print("col: ");
            int col = input.nextInt();
            myGrid.round(col-1, i);
            i++;
        }
    }
}
