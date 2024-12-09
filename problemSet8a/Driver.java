
/**
 * Naomi Wolfman
 * Problem set 8a
 * Dec. 5 2024
 */

import java.util.Scanner;
public class Driver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;
        do {
            game();
            System.out.println();
            System.out.print("Play again? [y] or [n]: ");
            ans = input.nextLine();
            while(!("y".equals(ans) || "n".equals(ans))) {
                System.out.print("Invalid input please answer again: ");
                ans = input.nextLine();
            }
        } while ("y".equals(ans));
    }

    public static void game () {
        Scanner input = new Scanner(System.in);
        Grid myGrid = new Grid();
        System.out.println("Round 1");
        myGrid.drawBoard();
        int i = 0;
        while (! (myGrid.winX() || myGrid.winY() || myGrid.full())) {
            char symbol = i%2 == 0 ? 'X' : '0';
            System.out.print("Player " + symbol + " please select a column: ");
            int col = input.nextInt();
            col--;
            while (!myGrid.validMove(col)) {
                System.out.print("Not a valid move. Please select again: ");
                col = input.nextInt();
                col--;
            }
            System.out.println("");
            System.out.println("Round " + (i+2));
            myGrid.round(col, symbol);
            i++;
        }
        System.out.println();
        if (myGrid.full()) {
            System.out.println("You both suck. No one wins.");
        } else {
            System.out.println("Player "+ (myGrid.winX() ? 'X' : 'Y') +" Wins!");
        }
    }
}
