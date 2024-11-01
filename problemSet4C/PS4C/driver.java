
/**
 * naomi wolfman
 * 1-3
 * oct. 28 2024
 */
import java.util.Scanner;
public class driver
{
    public static void main (String[] args) {
        System.out.println(Review.fakeReview("review.txt"));
    }

    static void testSV () {
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (i < 3) {
            String testWord = input.nextLine();
            System.out.println(Review.sentimentVal(testWord));
            if (Review.sentimentVal(testWord) != 0) i++;
        }
    }
    
}
