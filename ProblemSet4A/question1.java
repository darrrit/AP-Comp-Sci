/** naomi wolfman
 * 1-3
 * problem set 4 A
 * October 18, 2024
 */
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int correct = (int) (Math.random()*100) + 1;
        int tries = 1;
        System.out.print("Your guess: ");
        int guess = input.nextInt();
        while (guess != correct) {
            if (guess > correct) System.out.println("Nope, that guess is too high.");
            if (guess < correct) System.out.println("Nope, that guess is too low.");
            System.out.print("Your guess: ");
            tries ++;
            guess = input.nextInt();
        }
        System.out.println("You guessed it! It took you " + tries + " tries.");
    }
}